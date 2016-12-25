package com.it.synchronize.study;

public class Output {
	public  void outputName(){
		synchronized(this){
			for(int i = 0; i < 5; i++){
				System.out.println(Thread.currentThread().getName() +":"+ i);
				try {
					this.notifyAll();
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	public  void outputName2(){
		synchronized(this){
			for(int i = 0; i < 5; i++){
				System.out.println(Thread.currentThread().getName() +"--"+ i);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
