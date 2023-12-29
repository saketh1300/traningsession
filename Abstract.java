package com.mypackage.oops;


abstract class birds{
	public abstract void birdssound();
}

class piegion extends birds{
	public void birdssound() {
		System.out.println("the sound of the piegion is hhhhh");
	}
	
}
public class Abstract {
	public static void main(String[]args) {
		piegion pi=new piegion();
		pi.birdssound();
	}

}
