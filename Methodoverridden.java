package com.mypackage.oops;

class electronic{
	public void tv() {
		System.out.println("tv is  a electronic device");
	}
}
class digital extends electronic{
	public void tv() {
		System.out.println("tv is also a digital device");
	}
	
}





public class Methodoverridden {
	
	public static void main(String[]args) {
		electronic e;
		e=new electronic();
		e.tv();
		e=new digital();
		e.tv();
//		digital d=new digital();
//		d.tv();
//		electronic e=new electronic();
//		e.tv();
//		
	}

}
