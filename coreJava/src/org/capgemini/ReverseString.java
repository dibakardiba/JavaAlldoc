package org.capgemini;

public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "dibakar";
		String reverse="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reverse=ch+reverse;
		}
		System.out.println(reverse);
//try another approach	
	}

}
