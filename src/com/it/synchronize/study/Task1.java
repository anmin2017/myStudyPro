package com.it.synchronize.study;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task1 implements Runnable {
	private static Task1 task1 = null;
	private Lock lock = new ReentrantLock();
	
	public static Task1 getInstance(){
		if(task1 == null){
			task1 = new Task1();
		}
		return task1;
	}
	private Task1(){
	}
	public void run(){
		printName();
	}
    public  void printName(){
      lock.lock();
      try{
    	  for(int i=0;i<4;i++){
      		System.out.println(Thread.currentThread().getName()+":"+i);
      		Thread.sleep(1000);
      	  } 
      }catch(Exception e){
    	 e.printStackTrace(); 
      }finally{
    	  lock.unlock();
      }
    }
}
