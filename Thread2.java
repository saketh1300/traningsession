package com.mypackage.oops;

public class Thread2 implements Runnable{
	
	public void run() {
		System.out.println("the method of the thread");
		for(int i=1;i<10;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
			
	}
	
	public static void main(String[]args) {
		Runnable r=new Thread2();
		
		Thread t=new Thread(r,"sappuketh");
		
		t.start();
		
		String str=t.getName();
		System.out.println(str);
		
		
	}

}
