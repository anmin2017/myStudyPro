package com.it.study.comparestudy;

public class Person implements Comparable {
    private String name;
    private String sex;
    private int age;
    
    public Person(String nameArg,String sex,int age){
    	name = nameArg;
    	this.sex = sex;
    	this.age = age;
    }
    
	public int compareTo(Object obj) {
		Person p = (Person)obj;
		int result = 0;
		if(this.age < p.age){
			result = -1;
		}else if(this.age > p.age){
			result = 1;
		}else{
			result = 0;
		}
		return result;
	}
	
	public static void main(String[] args){
		Person p1 = new Person("zs","boy",22);
		Person p2 = new Person("ls","boy",23);
		int rs = p1.compareTo(p2);
		System.out.println("rs:" + rs);
	}

}
