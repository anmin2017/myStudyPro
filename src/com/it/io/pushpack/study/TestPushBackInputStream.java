package com.it.io.pushpack.study;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.StringWriter;

public class TestPushBackInputStream {
    private void testPushBack(){
    	try {
    		StringWriter sw = null;
			InputStream in = new FileInputStream("G:/temp/tempp.txt");
			PushbackInputStream pi = new PushbackInputStream(in,10);
			byte bb[] = new byte[10];
			int len = pi.read(bb);
			String tempStr = "";
			int index = 0;
			while(len != -1){
				tempStr = new String(bb,0,len);
				System.out.println(tempStr);
				index = tempStr.indexOf("helloworld");
//				if(index != -1){
//					String str = tempStr.substring(0,index);
//					byte[] bys = str.getBytes();
//					pi.unread(bys);
//					pi.read(bys);
//					String str2 = new String(bys);
//					System.out.println(str2);
//					//break;
//				}
				if(pi.markSupported()){
					pi.mark(1);
					pi.reset();
				}

				len = pi.read(bb);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block;
			e.printStackTrace();
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestPushBackInputStream tt =  new TestPushBackInputStream();
		tt.testPushBack();
//		  String s = "abcdefg";
//		  ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());
//		  PushbackInputStream pbin = new PushbackInputStream(in);
//	      try {
//	            int n;
//	            byte[] buffer = new byte[3];
//	            while ((n = pbin.read(buffer)) != -1) {
//	                System.out.println(new String(buffer,0,n));
//	                if(new String(buffer).equals("abc")){
//	                	pbin.unread("1".getBytes());
//	                }
//	            }
//	        }catch(Exception e){
//	        	e.printStackTrace();
//	        }
	}

}
