package com.it.io.stringwriter.study;

import java.io.IOException;
import java.io.StringWriter;

public class TestStringWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringWriter sw = new StringWriter(1024);
		sw.append("helloWorld", 2, 6);
		sw.append("12345679");
		StringBuffer sb = sw.getBuffer();
		System.out.println(sb.toString());
		try {
			sw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
