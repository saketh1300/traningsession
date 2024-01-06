package com.mypackage.oops;

public class ThreadRunnable implements Runnable {
	
	public  void run() {
		System.out.println("the thread is working without abstract class ");
	}


public static void main(String[]args) {
	ThreadRunnable tr=new ThreadRunnable() {
		public void run() {
			System.out.println("the thread is working");
		}
		
	};
	Thread t=new Thread(tr);// it is use a constructor in the thread class
	t.start();
	tr.run();
}
}