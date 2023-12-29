package com.mypackage.oops;

class student1{
	public void studentDetalies(String name,int no) {
		System.out.println("name:" +name + "number "+no);
	}


public void studentDetalies(int no,String name) {
	System.out.println("number "+no+ "name " +name);
}

}
public class MethodOverloading{
	public static void main(String[]args) {
		student1 s1=new student1();
		s1.studentDetalies(8, "pavan");
		s1.studentDetalies("saketh",9);
	}
}

