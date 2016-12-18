package com.it.fanxing.study;

public class TestFanxin<E>{
	private E tt;
	
	public TestFanxin(E t){
		tt = t;
	}
	
	private static void test(TestFanxin<Integer> tx){
		System.out.println(tx.get());
	}
	
	public E get(){
		return tt;
	}
	
	public static void main(String[] args){
		TestFanxin<Integer> test1 = new TestFanxin<Integer>(1);
		TestFanxin<String> test2 = new TestFanxin<String>("hello");
		
		System.out.println(test1.get());
		System.out.println(test2.get());
	}

}
