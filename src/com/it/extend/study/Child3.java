package com.it.extend.study;

import com.it.study.Parent;

/**
 * ctrl+shift+o 
 * 
 * @author Administrator
 *
 */
public  class Child3 extends Parent{
	protected int i ;
	public String func() {
      System.out.println("i am child");
      //super.func();
      return null;
    }
	
	
	
	public String toString(){
		return "i am chid3";
	}
	
	public static void main(String[] args){
		//Child3 child3 = new Child3();
		//System.out.println(child3);
	}



	@Override
	protected void test() {
		// TODO Auto-generated method stub
		
	}
}
