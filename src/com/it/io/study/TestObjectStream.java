package com.it.io.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStream {
	public static void main(String[] args){
		 Student s1=new Student("张三", 1, 15, "化学");
		 Student s2=new Student("李四", 2, 19, "生物");
		 
		try {
			FileOutputStream fo = new FileOutputStream("G:/temp/tempp.txt");
			ObjectOutputStream obo = new ObjectOutputStream(fo);
		
			obo.writeObject(s1);
			obo.writeObject(s1);
			obo.close();
			System.out.println("write Object successfully");
			
			FileInputStream fi = new FileInputStream("G:/temp/tempp.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Student s11 = (Student)oi.readObject();
			System.out.println(s11.name);
			
			Student s112 = (Student)oi.readObject();
			System.out.println(s112.name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
