package com.it.io.study;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Translation {
	
	private void trans(String word){
		try {
			InputStream in = new FileInputStream("dictionary.txt");
			Scanner scanner = new Scanner(in);
			InputStreamReader bi = new InputStreamReader(in);
			BufferedReader br = new  BufferedReader(bi);
			String tempLine = null;
		    boolean existFlag = false;
		    while((tempLine=br.readLine()) != null){
		    	if(tempLine.toLowerCase().startsWith((word+":").toLowerCase())){
					System.out.println(tempLine);
					existFlag = true;
					break;
				}
		    }
//			while(scanner.hasNextLine()){
//				tempLine = scanner.nextLine();
//				if(tempLine.toLowerCase().startsWith((word+":").toLowerCase())){
//					System.out.println(tempLine);
//					existFlag = true;
//					break;
//				}
//			}
			in.close();
			scanner.close();
			if(existFlag == false){
				System.out.println("can not find the word:" + word);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Translation translation =  new Translation();
		translation.trans("Yellow");
	}

}
