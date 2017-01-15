package com.it.socket.study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocket {
	private Socket socket;
	public ClientSocket(int port){
		try {
			socket = new Socket(InetAddress.getLocalHost(),port);
			//socket.bind(new InetSocketAddress(InetAddress.getLocalHost(),port));
			socket.connect(new InetSocketAddress(InetAddress.getLocalHost(),port));
			//socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void receiveMsg(){
		try {
			System.out.println("-------++----");
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("starting receiving2....");
			String content = dis.readUTF();
			System.out.println("starting receiving3....");
			
			System.out.println(content);
			
			System.out.println("-----------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendMsg(String msg){
	    try {
		   OutputStream ou = socket.getOutputStream();
		   DataOutputStream dou = new DataOutputStream(ou);
		   dou.writeUTF(msg);
		   dou.flush();
		   System.out.println("starting receiving....");
		   //dou.close();
		   receiveMsg();
		   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args){
		int i = 0;
//		while(true){
//			ClientSocket client = new ClientSocket(9878);
//			client.sendMsg("hello i am client" + i);
//			i++;
//		}
//		
		ClientSocket client = new ClientSocket(9878);
		client.sendMsg("hello i am client" + i);
	}
}
