package org.tcs.reverse;

public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=123456;
int rev=0;
while(number!=0) {
	int rem=number%10;
	rev=rev*10+rem;
	number=number/10;
	
}
System.out.println("reverse integer:::"+rev);
	}
}
