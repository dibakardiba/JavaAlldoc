package org.company.java;

public class Company {
boolean f =false;
	int n;
	//f=false : chance : producer 
//when one task running bcz of no one interfere this thing we use synchronized.
	//f=true : chance : consumer
	synchronized public void produce_item(int n) {
		
		if(f)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("produced ::" + this.n);
		f=true;
		notify();
	}

	synchronized public int consume_item() {
		if(!f)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" consume::::" + this.n);
		f=false;
		notify();
		
		return this.n;
	}
}
