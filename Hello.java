package com.mypackage.oops;

interface a {
	void project();
	void display();
}

 class a5 implements a{
	public void project() {
		System.out.println("show the project");
	}
	public void display() {
		System.out.println("displaying");
	}
 }
	
public class Hello{	
public static void main(String[]args) {
	a5 obj5=new a5();
	obj5.project();
	obj5.display();
}
}
	