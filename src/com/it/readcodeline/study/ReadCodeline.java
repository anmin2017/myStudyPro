package com.it.readcodeline.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ReadCodeline {
	
	private long lineCounts;
	
	int aa = 0;
	
	private void searchJavaFile(String dirPath){
		File srcFile = new File(dirPath);
		String fileName = srcFile.getName();
		if(srcFile.isFile() && fileName.endsWith(".java")){
		    readCodeLine(srcFile);
		}else if(srcFile.isDirectory()){
			File[] fileArray = srcFile.listFiles();
			String filePath = null;
			for(File tempFile: fileArray){
				 filePath = tempFile.getPath();
				 searchJavaFile(filePath);
			}
			
		}
		
	}
	
	private void readCodeLine(File file){
		try {
			InputStream in = new FileInputStream(file);
			Scanner scanner = new Scanner(in);
			while(scanner.hasNextLine()){
				lineCounts++;
				scanner.nextLine();
			}
			in.close();
			scanner.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private long getCodeLine(String initFilePath){
		searchJavaFile(initFilePath);
		System.out.println("finished");
		return lineCounts;
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReadCodeline readCodeline = new ReadCodeline();
		long count = readCodeline.getCodeLine("src");
		System.out.println("codeLines :" + count);
	}

}
