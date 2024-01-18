package com.mypackage.oops;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[]args) throws IOException {
		try {
			FileInputStream fi=new FileInputStream("c:\\Users\\pavan\\Desktop\\testout.txt");
			int z=0;
			while((z=fi.read())!=-1) {
				System.out.println((char)z);
			}
//			int i=fi.read();
//			System.out.println((char)i);
			fi.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
