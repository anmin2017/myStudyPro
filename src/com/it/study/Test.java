package com.it.study;

import com.it.extend.study.Child3;

public class Test {
	/** �����������ͱ������ݵĽϴ�ֵ */
	public static int max(int num1, int num2) {
	   int result;
	   if (num1 > num2)
	      result = num1;
	   else
	      result = num2;
	 
	   return result; 
	}
	
	public void sayHello(){
		
		System.out.println(111);
		return;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		int a = test.max(1, 2);
		System.out.println(a);
	}
}
