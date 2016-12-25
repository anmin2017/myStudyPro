package com.it.synchronize.study;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Output ouput = new Output();
		Thread thread1 = new Thread(new Runnable(){
        	public void run(){
        		ouput.outputName();
        		
        	}
        },"thread1");
        
        Thread thread2 = new Thread(new Runnable(){
        	public void run(){
        		ouput.outputName();
        	}
        },"thread2");
        
//
//        Thread thread3 = new Thread(new Runnable(){
//        	public void run(){
//        		ouput.outputName();
//        	}
//        },"thread3");
        
        thread2.start();
        thread1.start();
        //thread3.start();
        
        
        
	}

}
