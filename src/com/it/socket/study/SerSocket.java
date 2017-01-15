package com.it.socket.study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SerSocket {
	private ServerSocket serverSocket;
	private Socket socket = null;
	public SerSocket(int port){
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(),port));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendMsg(String msg){
		try{
			OutputStream ou = socket.getOutputStream();
			DataOutputStream dou = new DataOutputStream(ou);
			dou.writeUTF(msg);
			dou.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void receiveMsg(){
		while(true){
			try {
				System.out.println("start accepting...");
				socket = serverSocket.accept();
				System.out.println("accepted...");
				InputStream in = socket.getInputStream();
				
				DataInputStream dis = new DataInputStream(in);
				String content = dis.readUTF();
				
				System.out.println(content);
				
				Thread.sleep(5000);
				sendMsg("hello i am server1");
				//dis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerSocket sk = new SerSocket(9878); 
		sk.receiveMsg();
	
		
	}

}
