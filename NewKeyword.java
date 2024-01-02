package com.mypackage.oops;

public class NewKeyword {
	
	int a;
	int b;
	
	NewKeyword(int a,int b){
		this.a=a;
		this.b=b;
	}
	void result() {
		System.out.println(a+b);
	}
	
	String name;
	String name2;
	NewKeyword(String name,String name2){
		this.name=name;
		this.name2=name2;
	}
	void name() {
		System.out.println(name+name2);
	}


public static void main(String[]args) {
	NewKeyword k=new NewKeyword(18,852);
	k.result();
	NewKeyword n=new NewKeyword("sak","eth");
	n.name();
}
}