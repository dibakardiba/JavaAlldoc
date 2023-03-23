package org.capgemini;

public class SecondProgram {
	public static void main(String args[])
	{
		int a=50;
		double d= a;
		System.out.println("value is "+d); //automatically implicit.
		a=100;
		System.out.println("new value is::" +a);
		
		
		double myvariable=10.28;
		//int my_int=myvariable; //double not convert aUTOMATIcally its only implicit.
		
		int my_int=(int)myvariable;
		System.out.println("diba::" +my_int);
		
		
	}
}
