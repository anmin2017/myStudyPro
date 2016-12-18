package com.it.io.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestBufferedReader {

	private static void readFile(){
		try {
			FileInputStream fi = new FileInputStream("G:/temp/temp.txt");
			BufferedReader  bf = new BufferedReader(new InputStreamReader(fi,"utf-8"));
		    
			String content = bf.readLine();
			while(content != null){
				System.out.println(content);
				content = bf.readLine();
			}
			bf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile(){
		   try {
				OutputStream ou = new FileOutputStream("G:/temp/temp22.txt");
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ou));
			    bw.write("123helŒ“√«low22334\n445567");
			    bw.close();
			    System.out.println("write finished!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readFile();
		writeFile();
	}

}
