package com.it.synchronize.study;

import java.util.ArrayList;
import java.util.List;

public class TestProudctorAndConsumer {
	
	private void test(){
		List<String> list = new ArrayList<String>();
		final Productor pr = new Productor(list);
		final Consumer co = new Consumer(list);
		
		Thread productorThread = new Thread(new Runnable(){
			public void run(){
				while(true){
				  pr.produce();	
				}
			}
		});
		

		Thread consumerThread = new Thread(new Runnable(){
			public void run(){
				while(true){
				  co.consume();
				}
			}
		});
		
		productorThread.start();
		consumerThread.start();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProudctorAndConsumer tt = new TestProudctorAndConsumer();
		tt.test();
	}

}
