package org.tcs.reverse;

public class ReverseStr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Dibakar",istr="";
char ch;
for(int i=0;i<str.length();i++) {
	ch=str.charAt(i);
	System.out.println("character is  "+ch);
	istr=ch+istr;
	System.out.println("________");
	System.out.println("istr is :::  "+istr);
}
System.out.println(" \n reverse string :::  "+istr);

	}

}
