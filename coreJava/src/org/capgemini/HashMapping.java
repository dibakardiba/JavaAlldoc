package org.capgemini;

import java.util.HashMap;

public class HashMapping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> str= new HashMap<>();

		//adding elements
		str.put("dibakar", 3000);
		str.put("java", 500);
		str.put("python", 1000);
		str.put("js", 3000);
		str.put("js", 3000);
		//duplicate keys are not allowed
		//BiConsumer

		System.out.println(str);
		str.forEach((e1,e2)->{
			System.out.println(e1 + "=>"+e2);
		});
		str.forEach((key,value)->{
			System.out.println(key);
			System.out.print("->");
			System.out.println(value);
		});
		// entry set 
		//key set
		//find key with associate value
		System.out.println(str.get("dibakar"));
		
	}
}
