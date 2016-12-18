package com.it.io.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("test");
			int a = 0;
			a = in.read();
			while(a != -1){
				System.out.println((char)a);
				a = in.read();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
