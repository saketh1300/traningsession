package com.mypackage.oops;


public class ThreadPriority extends Thread{
	
	public void run() {
		System.out.println("the priority of the thread");
		
	}
	
	public static void main(String[]args) {
		ThreadPriority tp=new ThreadPriority();
		System.out.println(tp.getPriority());//default is 5
		tp.setPriority(16);// we can give only 10 
		System.out.println(tp.getPriority());
		
	}

}
