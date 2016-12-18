package com.it.study;

public abstract class Parent {
	private int i;
    protected int j;
    
    public int k;
    int h;
 
    protected String func() {
      System.out.println("i am parent");
      return null;
    }
    
    protected abstract void test();
}
