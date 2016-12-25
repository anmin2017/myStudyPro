package com.it.synchronize.study;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Productor {
	private List<String> list = null;
	
	public Productor(List<String> list){
		this.list = list;
	}
	
	public  void produce(){
	  synchronized(list){
		if(list.size() == 0){
			String apple = "Apple";
			System.out.println("produce:" + apple);
			list.add(apple);
		}else{
			list.notify();
			try {
				list.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  }
	}
}
