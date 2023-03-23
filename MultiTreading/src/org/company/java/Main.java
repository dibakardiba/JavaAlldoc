package org.company.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c= new Company();
		Producer p = new Producer(c);
		Consumer co = new Consumer(c);
		p.start();
		co.start();

	}

}
