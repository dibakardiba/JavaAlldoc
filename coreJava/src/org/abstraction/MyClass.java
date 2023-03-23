package org.abstraction;

public abstract class MyClass {
	//concrete/complete methods
		public void cal() {
			System.out.println("my name is concrete method ");
		}
		//abstract method 
		abstract public void rocket();

	}

	// Abstract class cannot be instantiated.

	class Start{
		public static void main(String [] args) {
			//bcz of abstract class 
//			Myclass myclass= new Myclass();
			
//			MyChildClass obj =new MyChildClass();
//			obj.cal();
//			obj.rocket();
			MyClass obj1= new MyChildClass();
			obj1.cal();
			obj1.rocket();
			
			
		}
}
