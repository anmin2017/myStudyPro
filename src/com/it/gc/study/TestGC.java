package com.it.gc.study;

import java.io.FilterInputStream;

public class TestGC{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1=new Person(1);
		Person p2=new Person(2);
		Person p3=new Person(3);
		p1=null;
		p2=null;
		System.gc();
		
	}
	}
 
class Person{
	private int id;
	public Person(int id){
		System.out.println("person"+" "+id+"is created");
	}
	public void finalize(){
		System.out.println("person"+" "+id+"is disapposed");
	}
}