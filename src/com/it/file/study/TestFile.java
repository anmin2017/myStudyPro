package com.it.file.study;

import java.io.File;
import java.io.IOException;

import com.it.io.study.TestBufferdStream;

public class TestFile {
	
	private static void createDir(){
		File dir = new File("chen");
		dir.mkdir();
	    System.out.println("direct has been created");
	}
	
	private static void seachTempFile(){
		File dir = new File("G:/temp");
		File fileArray[] = dir.listFiles();
		for(File tempFile : fileArray){
			realSearchFile(tempFile);
		}
	}
	
	private static void realSearchFile(File file){
		if(file.isFile()){
			String fileName = file.getName();
			String extendName = fileName.substring(fileName.lastIndexOf(".") + 1);
			if("jpeg".equals(extendName)){
				System.out.println(file.getPath());
			}
		}else{
			File fileArray[] = file.listFiles();
			for(File temp:fileArray){
				realSearchFile(temp);
			}
		}
	}
	
	
	
	private static void createFile(){
		File file = new File("chen/chen.txt");
		try {
			file.createNewFile();
			
			TestBufferdStream.writeFile("chen/chen.txt", "mao zhu shi wang sui");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//createDir();
		//createFile();
		seachTempFile();
		
	}

}
