package org.mutithread;
// creating our thread using runnable interface
 class MyThread implements Runnable {

	@Override
	public void run() 
	{
		//task for thread ....
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i is "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String []args)
	{
	//create obj of my thread class 
		MyThread t1= new MyThread();
		Thread t2= new Thread(t1);
		t2.start();
	}
}
