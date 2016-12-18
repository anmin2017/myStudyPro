package com.it.enumeration.study;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class TestEnumeration implements Enumeration {
    private List list;
    private int count;
    private int len;
    
    public TestEnumeration(List list){
    	this.len = list.size();
    	this.list = list;
    }
    
	@Override
	public boolean hasMoreElements() {
		boolean result = count < len;
		return result;
	}

	@Override
	public Object nextElement() {
		return list.get(count++);
	}
	
	public static void main(String[] args){
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		TestEnumeration en = new TestEnumeration(list);
		
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}

}
