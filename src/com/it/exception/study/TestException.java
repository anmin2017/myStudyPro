package com.it.exception.study;

public class TestException{
	private static double divide(double a,double b) throws ZeroException{
		if(b == 0){
			throw new ZeroException("除数不能为0");
		}
		return a/b;
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double b = divide(1,0);
			System.out.println(b);
		} catch (ZeroException e) {
			e.printStackTrace();
			System.out.println("出错啦");
		}

	}

}
