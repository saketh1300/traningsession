package com.mypackage.oops;



class doctor{
float salary=50005;
}
class dentist extends doctor{
float expension=453025;
}

public class inheritance3 {

	
	public static void main(String[]args) {
		
		dentist d=new dentist();
		System.out.println("salary of the doctor  "+d.salary);
		System.out.println("salary of the doctor  "+d.expension);
	}
	
	
	}

