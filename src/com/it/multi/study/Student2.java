package com.it.multi.study;

public class Student2 {
	private Student1 student1;
	
	
	public void test(){
		student1.sayName();
	}
	
	public void setStudent1(Student1 studentArg){
		student1 = studentArg;
	}
	
	public static void main(String[] args){
		Student1 s1 = new Student1();
		Student2 s2 = new Student2();
		s2.setStudent1(s1);
		s2.test();
	}
}
