package com.mypackage.oops;

public class Exception {

	public static void main(String[]args) {
		try {
			int z1=133/0;
			System.out.println("the rest of the code");
		}catch(ArithmeticException z1) {
			System.out.println(z1);
		}

	}
}
