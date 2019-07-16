package com.arvatosystems.us.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You may use org.apache.commons.lang.StringUtils and org.apache.commons.collections.CollectionUtils!
 */
public class Lists {

	/**
	 * Returns a new filtered and sorted list.
	 * 
	 * All blank strings are filtered out and and the returned list entries are sorted in ascending order, 
	 * according to the natural ordering of its elements
	 * 
	 * @param The list
	 * @return A new filtered list
	 * @throws IllegalArgumentException Raised if the given list is empty.
	 */
	public List<String> filterList(final List<String> list) throws IllegalArgumentException
	{
		return list.stream().filter(predicate -> (predicate!=null && !predicate.trim().equals(""))).sorted().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Irfa nn");
		l.add("");
		l.add("Srini K K");
		l.add("Ajmal");
		l.add("Iraa  nnn");
		l.add("");
		List k = filterList(l);
		
		k.forEach(action->System.out.println(action));
		
	}
	
}
