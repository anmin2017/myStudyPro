package com.it.synchronize.study;

public class Testtask1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Task1 t1=Task1.getInstance();
        Task1 t2=Task1.getInstance();
        
        Thread thread1=new Thread(t1,"thread1");
        Thread thread2=new Thread(t2,"thread2");
        
        thread1.start();
        thread2.start();
	}

}
