package com.it.thread.study;

public class MyTask implements Runnable {
    private String name;
    
    private Thread thread;
    
    public MyTask(String name){
    	this.name = name;
    }
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName());
			try {
			   if(i == 0 && thread.isAlive()){
				   
				   thread.join();
				   //thread.start();
			   }
			   Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void setThread(Thread thread){
		this.thread = thread;
	}

}
