package com.it.multi.study;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit f = new Apple();
		f.named();
		Apple a = (Apple)f;
		a.become();
		
		
		
		f = new Pear();
		f.named();
		Pear p = (Pear)f;
		p.become();
	}
}


abstract class Fruit{
	abstract void named();
}

class Apple extends Fruit{
	public void named() {
		System.out.println("Apple");
	}
	
	public void become(){
		System.out.println("I can become apple juice");
	}
}


class Pear extends Fruit{
	public void named() {
		System.out.println("Pear");
	}
	
	public void become(){
		System.out.println("I can become Pear juice");
	}
}
