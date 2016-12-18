package com.it.reg.study;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      // 按指定模式在字符串查找
	      String line = "This orAder 1999 ABCD was placed for QT30010!1 OK54213a";
	      //(ABC)
	      String pattern = "99(?<!19)";

	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);

	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(line);
	      System.out.println(m.groupCount());
	      int count = 0;
	      if (m.find()) {
	    	 count++;
	         //System.out.printf("Found value %s: " );
	         
	      } 
	      
	      Calendar c = null;
	      
	      String str = String.format("Found value %tc:",new Date());
	      System.out.printf(str);
	      
	      
	      Calendar c1 = Calendar.getInstance();
	      c1.set(2009,9 , 12);
	      c1.set(Calendar.DATE, 7);
	      c1.add(Calendar.YEAR, -10);
	      System.out.println("");
	      System.out.println(c1.getTime());
	      System.out.println(Calendar.YEAR);
	      
	      GregorianCalendar cc = new GregorianCalendar(); 
	      System.out.println("cc:" + cc.getTime());
	      
	}

}
