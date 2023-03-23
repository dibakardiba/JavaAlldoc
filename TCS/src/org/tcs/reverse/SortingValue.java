package org.tcs.reverse;

import java.util.List;

import java.util.Arrays;

public class SortingValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>number=Arrays.asList(12,112,123,34,56);
		number.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		//number.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		
	}
}
