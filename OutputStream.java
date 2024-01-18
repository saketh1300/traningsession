package com.mypackage.oops;

import java.io.FileOutputStream;
import java.io.IOException;  
public class OutputStream {
public static void main(String[]args)throws IOException  {
	try {
//		FileOutputStream fo=new FileOutputStream("C:\\Users\\pavan\\Desktop\\file.txt");
//		fo.write(85);
//		fo.close();
//		System.out.println("succes");
		
        FileOutputStream fout=new FileOutputStream("c:\\Users\\pavan\\Desktop\\testout.txt");    
        String s="Welcome to javaTpoint.";    
        byte b[]=s.getBytes();//converting string into byte array    
        fout.write(b);    
        fout.close();    
	}catch(IOException e) {
	System.out.println(e);
	}
}
}
