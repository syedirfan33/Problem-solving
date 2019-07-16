package com.arvatosystems.test2;
import java.util.Map;
import java.util.HashMap;


/* Add the patterns in this class, Example on how to add patterns is provided in getPatterns method.
 * 
 * 
 */

public class PatternResolver {

	public static Map<String,String[]> getPatterns() {
		Map<String,String[]> patternMap = new HashMap<>();
		patternMap.put("US", new String[] {"street","state,pobox","country"}); //Put how many attributes need to display each line, as an each element of the array
		patternMap.put("DE", new String[] {"street,pobox","state,country"});
		
		return patternMap;
	}
	
}
