package com.it.stack.study;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args){
		Stack stack = new Stack();
		stack.add("zs");
		stack.add("ls");
		stack.add(123);
		stack.add(true);
		//stack.clear();
		
		while(stack.size() > 0){
			System.out.println(stack.pop());
		};
		
		for(Object temp: stack){
			System.out.println(temp);
		}
	}
}
