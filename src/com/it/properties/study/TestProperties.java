package com.it.properties.study;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestProperties {
	
	private Map<String,String> parse1(){
		Map<String,String> result = new HashMap<String,String>();
		try {
			DataInputStream di = new DataInputStream(new FileInputStream("D:/workspaceStudy/myStudyPro/test.properties"));
			String line = di.readLine();
		
			String[] tempStrArray = null;
			
			while(line != null){
				tempStrArray = line.split("=");
				result.put(tempStrArray[0], tempStrArray[1]);
				line = di.readLine();
			}
			
			di.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public void writeProperties(String key,String value){
		Map<String,String> map = parse1();
		map.put(key, value);
		Set<String> set = map.keySet();
		String str = "";
		for(String tempKey: set){
			str += tempKey + "=" + map.get(tempKey) + "\n";
		}
		System.out.println(str);
		try {
			OutputStream ou = new FileOutputStream("D:/workspaceStudy/myStudyPro/test.properties");
			ou.write(str.getBytes());
			ou.close();
			System.out.println("finished");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private Map<String,String> parse2(){
		Map<String,String>map=new HashMap<String,String>();
		DataInputStream d;
		try {
			d = new DataInputStream(new FileInputStream("D:/workspaceStudy/myStudyPro/test.properties"));
			ByteArrayOutputStream bis=new ByteArrayOutputStream();
			
			byte[] buf=new byte[1024];
			int len;
			try {
				len = d.read(buf);
				while(len!=-1){
					bis.write(buf,0,len);
					len = d.read(buf);
				}
			
				String s=bis.toString();
				String[]stringArray=s.split("(=|\n)");
//				for(String temp:stringArray){
//					System.out.println(temp);
//				}
				for(int i=0;i<stringArray.length;i++){
					if(i % 2 == 0){
						map.put(stringArray[i], stringArray[i+1]);
					}
				}
				
				d.close();
				bis.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
		
		

		
	}
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestProperties test = new TestProperties();
	
//		Map<String,String> map2 = test.parse2();
//		System.out.println(map2.get("name"));
		test.writeProperties("class", "12");
	}

}
