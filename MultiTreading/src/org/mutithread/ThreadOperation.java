package org.mutithread;
class UserThread extends Thread{
	public void run() {
		// task for thread
		
		System.out.println("this is user defined thread ");
	}
}
class ThreadOperation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("program started......");

		int x = 56 + 34;
		System.out.println("sum is this " + x);
		// tHread ....
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("name of thread " + tname);

		// rename of thread setname
		t.setName("MyMain");
		System.out.println("name of new thread is " + t.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("get id " + t.getId());
		// going to start user defined thread
		
		System.out.println("program terminated .......");
		UserThread to= new UserThread();
		to.start();
	}

}
