package com.mypackage.oops;



class Animal {

	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

		class Dog extends Animal {

	
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	public class inheritance {
	  public static void main(String[] args) {

	
	    Dog dg = new Dog();

	
	    dg.name = "Rohu";
	    dg.display();

	  
	    dg.eat();

	  }
	}


	
	//class doctor{
//	float salary=50005;
//}
//class dentist extends doctor{
//	float expension=453025;
//}



//	
//	public static void main(String[]args) {
//		
//		dentist d=new dentist();
//		System.out.println("salary of the doctor  "+d.salary);
//		System.out.println("salary of the doctor  "+d.expension);
//	}
//	
//
//}
