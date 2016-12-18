package com.it.multi.study;

public class MutiTest {
	
	
	public static void main(String args[]){
		Person p=new Boy();
		p.sleep();
		Boy b=(Boy)p;
		b.doSports();
		
		p=new Girl();
		p.sleep();
		Girl g=(Girl)p;
		g.doSports();
		
		
	}

}
 abstract class Person{
	 abstract void sleep();
 }
 class Boy extends Person {
	 public void sleep(){
		 System.out.println("sleep at 9 PM");
	 }
	 public void doSports(){
		 System.out.println("playing football");
	 }
	 
 }
 class Girl extends Person{
	 public void sleep(){
		 System.out.println("sleep at 8 PM");
	 }
	 public void doSports(){
		 System.out.println("playing pingpong");
	 }
 }