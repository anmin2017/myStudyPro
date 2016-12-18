package com.it.thread.study;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        MyTask task1 = new MyTask("task1");
        Task2 task2 = new Task2();
        
        Thread thread1 = new Thread(task1,"t111222");
        Thread thread2 = new Thread(task2,"t2");
        task1.setThread(thread2);
        thread1.start();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        thread2.start();
        //thread2.start();
        
        System.out.println("=============");
	}

}
