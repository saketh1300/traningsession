package com.mypackage.oops;

public class Mythread extends Thread {
	
	public void run() {
		
		System.out.println("the thread begin to continue execution");
	}

	public static void main(String[]args) {
		Mythread mt=new Mythread();
		
		mt.start();
		System.out.println("the thread started its action");
	}
}
