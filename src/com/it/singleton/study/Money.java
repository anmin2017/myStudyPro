package com.it.singleton.study;

public class Money {
	private static double money;
	
	public void setMoney(double money){
		this.money = money;
	}
	
	public double getMoney(){
		return money;
	}
	
	public static void main(String[] args){
		Money money1 = new Money();
		Money money2 = new Money();
		
		money1.setMoney(100);
		System.out.println("money1.money:" + money1.getMoney());
		money2.setMoney(300);
		System.out.println("money2.money:" + money2.getMoney());
		System.out.println("money11.money:" + money1.getMoney());
		System.out.println("money11.money:" + money1.getMoney());
	}
}
