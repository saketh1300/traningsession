package com.mypackage.oops;

public class ThreadName extends Thread{
	
	ThreadName(String bijlee){
		super(bijlee);
	}
	
	public void run() {
		System.out.println("the thread get the name");
	}
	public static void main(String[]args) {
		
		ThreadName tn=new ThreadName("spk");
		ThreadName tn2=new ThreadName("pk");
		
		System.out.println("the thread name"+tn.getName());
		System.out.println("the thread name"+tn2.getName());
		
		tn.start();
		tn.setName("roja");
		tn2.setName("anjali");
		System.out.println("the thread name"+tn.getName());
	System.out.println("the thread name"+tn2.getName());
		
		
	}

}
