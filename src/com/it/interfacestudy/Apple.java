package com.it.interfacestudy;

public class Apple implements Fruit {

	public void sayName() {
        System.out.println(this.name);
	}

	public void setName(String name) {
      //this.name = "apple";
	}

	public void test() {
		System.out.println("ofcourse");
	}
	
	
	public static void main(String[] args){
		Apple apple = new Apple();
		apple.sayName();
		apple.test();
	}

}
