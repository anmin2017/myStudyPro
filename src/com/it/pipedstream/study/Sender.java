package com.it.pipedstream.study;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Sender extends Thread {
	private PipedOutputStream ou;
	
	public Sender(PipedOutputStream ou){
		this.ou = ou;
	}
	
	@Override
	public void run() {
		String hello = "Hello World";
		try {
			for(int i = 0; i < 5; i++){
				ou.write(hello.getBytes());
			}
			ou.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
