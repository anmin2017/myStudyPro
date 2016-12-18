package com.it.io.study;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
    int id ;
    int age;
    String department;
    public Student(){}
    public Student(String name, int id, int age, String department) {
	   this.age = age;
	   this.department = department;
	   this.id = id;
	   this.name = name;
	}
}
