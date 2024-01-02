package com.mypackage.oops;


import java.util.ArrayList;

public class Array2 {
	public static void main(String[]args) {
		ArrayList<String> bikes=new ArrayList<String>();
		bikes.add("bmw");
		bikes.add("bullet");
		bikes.add("harvely davidson");
		System.out.println(bikes);
		
		bikes.remove(0);
		//bikes.clear();
		for(String i:bikes) {
			System.out.println(i);
			
		}
			
	}

}
