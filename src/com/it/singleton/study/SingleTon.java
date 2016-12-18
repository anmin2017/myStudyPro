package com.it.singleton.study;

public class SingleTon {
	private static SingleTon instance;
	
	private SingleTon(){}
	
	public static SingleTon getInstance(){
		if(instance == null){
			instance = new SingleTon();
		}
		return instance;
	}
	
	public void getMoney(double mon){
		System.out.println(this);
	}
}
