package com.it.fanxing.study;

public class Test {
	
	private TestFanxin<?> tt;
	
	private static void test(TestFanxin<?> tx){
		System.out.println(tx.get());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new TestFanxin<Integer>(1));
		test(new TestFanxin<String>("hello"));
	}

}
