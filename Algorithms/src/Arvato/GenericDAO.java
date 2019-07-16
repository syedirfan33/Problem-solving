package Arvato;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.arvatosystems.us.training.dep.Entity;
import com.arvatosystems.us.training.dep.SearchQuery;
import com.arvatosystems.us.training.dep.SearchResult;
import com.arvatosystems.us.training.dep.SearchService;

/**
 * 
 * Requirement: 
 * Please describe GenericDAO class and their method in the comment
 * 
 */

public abstract class GenericDAO<E extends Entity>
{
	private static final Logger log = org.apache.log4j.Logger.getLogger(GenericDAO.class);

	protected SearchService searchService;

	private final Class<E> clazz;
	
	public GenericDAO()
	{
		this.clazz = ((Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}


	public List<E> findAll(final int count, final int start)
	{
		return findAllByAttributes(null, null, count, start, false);
	}


	public List<E> findAllByAttributes(final Map<String, Object> attribs, final Map<String, Boolean> orderByMap, final int count,
			final int start, final boolean excludeSubtypes)
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("SELECT {pk} FROM {").append(clazz.getSimpleName());

		if(excludeSubtypes){
			sb.append("!}");
		} else {
			sb.append("}");
		}

		if (attribs != null && CollectionUtils.isNotEmpty(attribs.entrySet()))
		{
			sb.append(" WHERE");
			for (final String attr : attribs.keySet())
			{
				sb.append(" {").append(attr).append("} = ?").append(attr).append(" AND");
			}
			sb.delete(sb.length() - 4, sb.length());
		}
		if (orderByMap != null && CollectionUtils.isNotEmpty(orderByMap.entrySet()))
		{
			sb.append(" ORDER BY ");
			for (final Entry<String, Boolean> orderBy : orderByMap.entrySet())
			{
				sb.append("{").append(orderBy.getKey()).append("} ").append(Boolean.TRUE.equals(orderBy.getValue()) ? "ASC" : "DESC")
						.append(", ");
			}
			sb.delete(sb.length() - 2, sb.length());
		}

		if(log.isDebugEnabled()) {
			log.trace(sb.toString() + " attributes: " + attribs);
		}

		final SearchQuery query = new SearchQuery(sb.toString());
		query.setCount(count);
		query.setStart(start);
		if (attribs != null)
		{
			query.getQueryParameters().putAll(attribs);
		}
		final SearchResult<E> result = searchService.search(query);
		return result.getResult();
	}
}
