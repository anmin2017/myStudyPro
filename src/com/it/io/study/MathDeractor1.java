package com.it.io.study;

public class MathDeractor1 extends MyMath {
	private MyMathChild child;
	
	public MathDeractor1(MyMathChild child){
		this.child = child;
	}

	@Override
	public double add(double a, double b) {
		double result = child.add(a, b);
		System.out.println(result);
		return result;
	}

	@Override
	public double time(double a, double b) {
		double result = child.time(a, b);
		System.out.println(result);
		return result;
	}

	
	
}
