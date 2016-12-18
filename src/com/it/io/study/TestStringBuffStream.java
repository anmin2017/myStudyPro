package com.it.io.study;


public class TestStringBuffStream {
	
	private static void readFile(){
		try {
			//FileInputStream fi = new FileInputStream("G:/temp/temp22.txt");
			StringBu  di = null;
		
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
