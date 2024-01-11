package com.mypackage.oops;

import java.io.*;

class  Cexception extends Exception{
	
}

public class Fileio {
	public static void main(String[]args) throws IOException {
		try {
//			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\pavan\\Desktop\\output2.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\pavan\\Desktop\\output.txt"));
			
			bw.write("saketh\n");
			bw.write("pavan\n");
			bw.write("debit\n");
//			String n;
//			while((n=br.readLine())!=null) {
//				System.out.println("koshy");
//			}
			bw.close();
//			br.close();
			
		}
		finally {
			System.out.println("sop");
		}
	}

}
