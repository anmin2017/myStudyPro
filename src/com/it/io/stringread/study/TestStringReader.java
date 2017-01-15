package com.it.io.stringread.study;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collections;

public class TestStringReader {
	
	private void getWordCount(String content){
	
		StringReader sr = new StringReader(content);
		StreamTokenizer tz = new StreamTokenizer(sr);
		int count = 0;
		try {
			while(tz.nextToken() != StreamTokenizer.TT_EOF){
				if(tz.ttype == StreamTokenizer.TT_WORD){
					count++;
				}
			}
			System.out.println("count:" + count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestStringReader tt = new TestStringReader();
		tt.getWordCount("hello java world");
	}

}
