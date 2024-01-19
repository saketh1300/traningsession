package com.mypackage.oops;

import java.util.*;

public class List {

	public static void main(String[]args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("pa1");
		al.add("su4rita");
		al.add("dhan13");
		
		System.out.println(al);
		al.add(1,"3veni");
		al.set(0, "debit");
		System.out.println(al);
		System.out.println(al.get(2));
		al.remove(3);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.addFirst("jee1");
		ll.add("rukh");
		ll.add("2ni");
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
		for(String st : ll) {
			System.out.println(st);
		}
	}

}
