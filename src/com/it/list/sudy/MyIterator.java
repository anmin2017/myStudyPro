package com.it.list.sudy;

import java.util.Enumeration;
public class MyIterator  implements Enumeration {
	private Object[] obj;
	private int count = 0;
	private int len;
	
	public MyIterator(Object[] obj,int len){
		this.obj = obj;
		this.len = len;
	}
	public boolean hasMoreElements() {
		boolean reesult = count<len;
		return reesult;
	}
	public Object nextElement() {
		return obj[count++];
	}
}
