package org.capgemini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Traverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names =new ArrayList<String>();
		names.add("dibakar");
		names.add("rahul");
		names.add("koushik");
		names.add("arnab");
		names.add("deepbaran");
		names.add("deepbaran");
// 3 traverse process  Iterator ,ListIterator and for each loops
		
		// for Each loops
		
		for(String str: names) 
		{
		System.out.println(str + "\t "+ str.length());
		System.out.println("_--------------------");
			//also doing reverse print 
			System.out.print(str + "\t "+ str.length()+"\t" );
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());

		}
		System.out.println("_________-");
		//traversing through Iterator : Forward Traversing
		
		Iterator<String> itr=names.iterator();
		//Iterator ->interface iterator ->method
		while(itr.hasNext())
		{
		String next= itr.next();
		System.out.println(next);
		}
		System.out.println("_______");
		// Backward Traversal of collection ListIterator
		//1st e backward er jonno cursor take ending point e niye jete hbe
		// that's why use names.size
		
	ListIterator <String> listitr= names.listIterator(names.size());
	while(listitr.hasPrevious()) {
		String previs=listitr.previous();
		System.out.println(previs);
	}
	// eneumeration homework vector
	//1hr 24 min sdone 
	//For Each  method
	//consumer one type of funtional interface
	System.out.println("********");
	 names.forEach(e->{ 
		System.out.println(e);
	});
	 System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
	 names.forEach(str->{
		 System.out.println(str);
	 });
	 System.out.println("treeSet--------");
	 TreeSet<String> set =new TreeSet<>();
	 set.addAll(names);
	 set.forEach(e->{
		 System.out.println(e);
	 });
	 //comparable and comparator for custom sorting logic hw
	 
	 
	}

}
