package com.it.scanner.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fi;
		try {
			fi = new FileInputStream("chen/chen.txt");
			Scanner scanner = new Scanner(fi);
			//System.out.println(scanner.next());
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			};
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
