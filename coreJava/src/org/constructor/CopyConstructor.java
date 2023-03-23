package org.constructor;

public class CopyConstructor {
//Copy Constructor in Java:
	// A copy constructor is used for copying the values of one object to another
	// object
		// TODO Auto-generated method stub
		 String web;
		    CopyConstructor (String w)
		    {
		        web = w;
		    }
		    /* This is the Copy Constructor, it 
		        * copies the values of one object
		        * to the another object (the object
		        * that invokes this constructor)
		    */
		    
		    CopyConstructor (CopyConstructor cc)
		    {
		        web = cc.web;
		    }
		    
		    void disp ()
		    {
		        System.out.println ("Constructor: " + web);
		    }
		    public static void main (String args[])
		    {
		        CopyConstructor obj1 =new CopyConstructor ("Example of Copy Constructor in Java");
		        /* Passing the object as an argument to the constructor
		            * This will invoke the copy constructor
		        */
		        CopyConstructor obj2 = new CopyConstructor (obj1);
		        obj1.disp ();
		        obj2.disp ();
		    }
		}
