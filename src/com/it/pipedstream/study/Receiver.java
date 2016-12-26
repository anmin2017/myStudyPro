package com.it.pipedstream.study;

import java.io.IOException;
import java.io.PipedInputStream;

public class Receiver extends Thread {
	private PipedInputStream pi ;
	
	public Receiver(PipedInputStream pi){
		this.pi = pi;
	}

	@Override
	public void run() {
		byte[] array = new byte[1024];
		try {
				int len = pi.read(array);
				String content = new String(array,0,len);
				System.out.println("content:" + content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
