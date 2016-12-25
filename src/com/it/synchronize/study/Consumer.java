package com.it.synchronize.study;

import java.util.List;

public class Consumer {
	private List<String> list = null;
	
	public Consumer(List<String> list){
		this.list = list;
	}
	
	public void consume(){
		synchronized(list){
			if(list.size() > 0){
				String apple = list.get(0);
				System.out.println("apple consume:" + apple);
				list.clear();
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
