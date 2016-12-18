package com.it.overstudy;

public class Overloading {
   public Overloading(){}
   
   public int add(int a,int b){
    	int t=a+b;
    	return t;
   }
   public int add(int a,int b,int c){
	   int t=a+b+c;
	   return t;
   }
   public static void main(String[] arg){
	 Overloading o=new Overloading();
	 int d= o.add(1, 8);
	 System.out.println(d);
	 int e=o.add(10, 11,12);
	 System.out.println(e);
   }
}
