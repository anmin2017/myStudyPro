package com.it.collections.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	public int id;
	public Person(int id){
		this.id = id;
	}
}

//class MyComparator implements Comparator{
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		Person p11 = (Person)o1;
//		Person p21 = (Person)o2;
//		return p11.id - p21.id;
//	}
//}

public class TestCollections {
	
	public  static void main(String[] args){
	   List list1 = new ArrayList();
	   
	   Person p1 = new Person(2);
	   Person p2 = new Person(3);
	   Person p3 = new Person(1);
	   list1.add(p1);
	   list1.add(p2);
	   list1.add(p3);
	   
	   Collections.sort(list1, new Comparator(){
		   public int compare(Object o1,Object o2){
			   Person p11=(Person)o1;
			   Person p12=(Person)o2;
			   return  p11.id-p12.id;
		   }
	   });
	   
	   
	 
	   
	  
	  
	   

	   
//	   for(int i = 0; i < list1.size(); i++){
//		   list2.add(list1.get(i));
//	   }
	   
	   for(Object temp: list1){
		   Person p = (Person)temp;
		   System.out.println(p.id);
	   }
	   
	}
}
