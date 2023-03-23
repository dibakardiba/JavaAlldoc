package org.capgemini;
class Test{
	int i;
	
	void setValue(int i) {
		this.i=i;
	}
	void show() {
		System.out.println("name is \t "+i);
	}
}

public class Constructor {
public static void main(String[] args) {
		
		Test t = new Test();
		t.setValue(15);
		t.show();
		// TODO Auto-generated method stub

	}

}
