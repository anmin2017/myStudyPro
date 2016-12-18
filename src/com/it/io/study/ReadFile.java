package com.it.io.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadFile{

	private static double divide(double a,double b){
		return a/b;
	}
	
	
	public static void test() throws Exception{
		try {
			FileInputStream fis=new FileInputStream("G:/temp/temp.html1");
			
		    
			
			int x = fis.read();
		} catch (Exception e) {
			System.out.println(111);
			//e.printStackTrace();
			throw e;
		} finally{
			System.out.println(33);
		}
		System.out.println(11);
		
	}
	/**
	 * 练习文件的输入和输出流，将文件temp.html内容写入到temp.txt
	 * @author chenlinjuan
	 * @since 2016-11-15
	 */
	private static void readAndWriteFile(){
		try {
			InputStream fis=new FileInputStream("G:/temp/temp.html");
			OutputStream fo=new FileOutputStream("G:/temp/temp.txt");
			FilterOutputStream fio = new FilterOutputStream(fo);
			
			MyFilterInputStream fi = new MyFilterInputStream(fis);
			int temp=0;
			temp=fis.read();
			while(temp !=-1){
				temp=fis.read();
				fio.write(temp);
			}
			fis.close();
			fo.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
		}
	}
	
	private static  void writeContent2TempText(){
		try {
			
			FileInputStream fileInputStream = new FileInputStream("G:/temp/default.jpeg");
			int temp2 = 0;
			
			FileOutputStream fo = new FileOutputStream("G:/temp/41.jpeg");
			
			temp2 = fileInputStream.read();
			while(temp2 != -1){
				temp2 = fileInputStream.read();
		    	fo.write(temp2);
		    };
			
		    fileInputStream.close();
			fo.close();
			System.out.println("finished");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		//writeContent2TempText();
		//readAndWriteFile();
//		double aa = 1/2;
//		System.out.println(aa);
		//ZeroException z = new Exception();
		String name = null;
		System.out.println(name.length());
		
		try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println(22);
	}
}
