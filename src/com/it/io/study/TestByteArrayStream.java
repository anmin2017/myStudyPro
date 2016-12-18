package com.it.io.study;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class TestByteArrayStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream("G:\\temp\\index.html");
			byte[] b = new byte[1024];
			int len = in.read(b);
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			while(len != -1){
				bo.write(b,0,len);
				len = in.read(b);
			}
			bo.close();
			in.close();
			
			String content = bo.toString();
			System.out.print(content);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
