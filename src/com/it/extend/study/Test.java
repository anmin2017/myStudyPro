package com.it.extend.study;

import com.it.extend.study.Child3;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child3 child3 = new Child3();
       child3.func();
       System.out.println(child3 instanceof Child3);
      
       StringBuffer name = new StringBuffer("zs");
       StringBuffer str = name.append(" ls");
       str.append(" ww");
       
       System.out.println(name);
       System.out.println(str);
       
       String a1 = "a1";
       String a2 = a1;
       a2 = a2+"a2";
       
       System.out.println("a1==" + a1);
       System.out.println("a2==" + a2);
       System.out.println(child3.i);
       //System.out.println(child instanceof Child);
	}
}
