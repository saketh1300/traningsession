package com.mypackage.oops;

public class Exception1 {
	public static void main(String[]args) {
		int nums[]=new int[5];
		
		try {
			System.out.println(nums[5]);
			System.out.println(nums[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("somethoing went wrong"+e);
			 
		}
		
	}
	
	
	

}
 
