package com.it.io.study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestBufferdStream {
	
	public TestBufferdStream(){
		
	}
	
	public static void writeFile(String fileName,String inputContent){
		 try {
				OutputStream ou = new FileOutputStream(fileName);
				DataOutputStream dot= new  DataOutputStream(ou);
			    dot.writeUTF(inputContent);
			    dot.close();
			    System.out.println("write finished!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private static void readFile(){
		try {
			FileInputStream fi = new FileInputStream("G:/temp/temp22.txt");
			DataInputStream  di = new DataInputStream(fi);
		
			char tempContent = (char)-1;
			String temp = null;
			byte[] b = null;
			do{
				tempContent = di.readChar();
				System.out.print(tempContent);
			}while(tempContent != -1);
			
			//di.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
  public static void writeFile(){
	   try {
			OutputStream ou = new FileOutputStream("G:/temp/temp22.txt");
			DataOutputStream dot= new  DataOutputStream(ou);
		    dot.writeChars("123helŒ“√«low");
		    dot.close();
		    System.out.println("write finished!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
	
   public static void main(String[] args){
	   readFile();
	   //writeFile();
//	   String name = "abc";
//	   byte b[] = null;
//	   try {
//		b = name.getBytes("IS0-8859-1");
//	   } catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//	   }
//	   for(int i = 0; i < b.length; i++){
//		   System.out.println(b[i]);
//	   }
   }
}
