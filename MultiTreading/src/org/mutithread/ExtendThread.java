package org.mutithread;

class ExtendThread extends Thread {

	// creating thread using thread class
	public void run() {
		//task for thread
		for(int i=10; i>=1;i--) {
			System.out.println("reverse value is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread t1=new ExtendThread();
		t1.start();
	}

}
