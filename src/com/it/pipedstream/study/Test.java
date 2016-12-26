package com.it.pipedstream.study;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Test {
	
	private void test(){
		PipedOutputStream ou = new PipedOutputStream();
		Sender sender = new Sender(ou);
		PipedInputStream in = new PipedInputStream();
		Receiver receiver = new Receiver(in);
		
		
		PipedOutputStream ou2 = new PipedOutputStream();
		Sender sender2 = new Sender(ou2);
		PipedInputStream in2 = new PipedInputStream();
		Receiver receiver2 = new Receiver(in2);
		
		
		try {
			ou.connect(in);
			ou2.connect(in2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sender.start();
		sender2.start();
		receiver.start();
		receiver2.start();
		
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test tt = new Test();
		tt.test();
	}

}
