package com.mypackage.oops;

import java.io.*;
public class TryWithResources {
  public static void File() throws IOException {
    File newFile=new File("saketh.txt");
    FileInputStream stream=new FileInputStream(newFile);
  }

  public static void main(String[] args) {
    try{
      File();
    } catch(IOException e){
      System.out.println(e);
    }
  }
}
