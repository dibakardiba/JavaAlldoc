package org.capgemini;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Map {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating collection
		/*
		 * type safe collection ->same type of elements (objects)are added to collection
		 * un type safe collection ->different types of elements can be added to collection
		 */
		
		//type safe 
ArrayList<String> names =new ArrayList<String>();
names.add("dibakar");
names.add("rahul");
names.add("koushik");
names.add("arnab");
names.add("deepbaran");
names.add("deepbaran");

System.out.println("collection"+names);
System.out.println(names.get(2)); //get the index value
System.out.println(names.get(0));
names.remove(3);
System.out.println(names);
names.remove("deepbaran");
System.out.println(names);
//names.add(5); ->type safe 
//untype safe
LinkedList list =new LinkedList();
list.add("dibakar:");
list.add(5);
list.add(true);
System.out.println(list);
names.remove( "arnab"); //remove elements
System.out.println("new names "+names);

//size of list
System.out.println("SIZE ="+names.size());

//check elements presents or not 
//types ka equal methos call karta hain checking karne k liye
// student 
System.out.println("check elements " + names.contains("dibakar hazra"));


//check for empty
System.out.println("empty \t"+ names.isEmpty());
//check tomorrow how we use foreach

//setting values
names.set(1, "dipu");
System.out.println("rahul  is " +names);
//setting values also not remove previous one
names.add(2, "dipanakar");
System.out.println("{{{{{{{  is " +names);

// remove all elements

//names.clear(); 
System.out.println("remove "+names);

// Type safe vector 

Vector<String>vector= new Vector<>();
//collection of all list names add here 
vector.addAll(names);
System.out.println(" vector elements" +vector);

System.out.println("next topic _____---------------------------------------------------------------------");



//Hashset ,Treeset  , HashMap
//check video of Wrapper class
//auto boxing and un auto boxing
HashSet<Double>nms =new HashSet<>();
nms.add(15.1415);
nms.add(14.14);
nms.add(99.34);
nms.add(99.34); //duplicates are not allowed
System.out.println(nms);
//hashset and set not extra methods but list have extra methos get

//TreeSet
TreeSet<Double>tset=new TreeSet<>();
tset.addAll(nms);
System.out.println("treeset is "+tset);
//tset sorting ascending order .
/*
 * learn comparator and Comparable in java
 */



	}
}
