package com.mypackage.oops;



public class Array {
	
	public static void main(String[]args) {
		int a[]=new int[3];
		a[0]=1;
		a[1]= 5;
		a[2]=3;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("----------------------------------");
		
		int b[]= {55,52,69,89,753,7458};
		for(int i:b)
		System.out.println(i);
		
		System.out.println("--------------------------------");
		
		String movie[]=new String[1];
		movie[0]="dada";
		System.out.println(movie[0]);
		
		System.out.println("--------------------------------");
			
		//multidimensional
		String name[][]= {{"saketh","pavan","kaushik"},{"appu","nikki","mouni"}};
		
		System.out.println(name[0][0]+name[1][0]);
		System.out.println(name[0][1]+name[1][1]);
		System.out.println(name[0][2]+name[1][2]);
		
		System.out.println("--------------------------------");
		
		name[0][0]="harsha";
		System.out.println(name[0][0]);
		System.out.println(name[0][0]+name[1][0]);
		
	
		
	}

}
