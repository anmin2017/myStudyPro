package com.it.list.sudy;

public class MySet {
	private Object[] obj = new Object[100];
	private int size = 0;
	public void add(Object objArg){
		obj[size++] = objArg;
	}
	public Object get(int i){
		return obj[i];
	}
	public int size(){
		return size;
	}
	public MyIterator interator(){
		return new MyIterator(obj,size);
	}
}
