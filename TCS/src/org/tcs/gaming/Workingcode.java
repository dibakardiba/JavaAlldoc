package org.tcs.gaming;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Workingcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Boolean,String>map=new TreeMap<>((a,b)->1);
		map.put(Boolean.TRUE, "before_"+"xml1"+"_chandan");
		map.put(Boolean.TRUE, "During_"+"xml2"+"_dibakar");
		map.put(Boolean.FALSE, "After_"+"xml3"+"_shaista");
		Map<Boolean, String> sortedTreeMap = map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(
		    Map.Entry::getKey, Map.Entry::getValue,
		    (x, y) -> x, () -> new TreeMap<>((a, b) -> 1)
		 ));
		   sortedTreeMap.entrySet().forEach(System.out::println);
		   
		   Set<Entry<Boolean, String>> entries
		   = sortedTreeMap.entrySet();
		   for (Map.Entry<Boolean, String> entry : entries) {
			   System.out.println ("->"
		               + entry);
			   String[]str= entry.getValue().split("_");
		       System.out.println ("->"
		                          + str[2]);
		   }
	}

}
