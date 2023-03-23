package org.program;

import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username ="user123";
		String password ="dibak";
		Scanner sc =new Scanner(System.in);
		System.out.println("enter username");
		String inputUsername= sc.nextLine();
		System.out.println("enter password");
		String inputpassword=sc.nextLine();
		
		if(inputUsername.equals(username) && inputpassword.equals(password))
		{
		System.out.println("Login Successful!");
		}
		else{
		System.out.println(" Login Not Successful");
		}

	}

}
