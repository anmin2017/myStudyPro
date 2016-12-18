package com.it.study.datestudy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateStudy {
	private  static String name;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateStudy d = new DateStudy();
		System.out.println("aa:" + name);
	   // 初始化 Date 对象
       Date date = new Date();
       Date date2 = new Date(116,3,2);
       int aa = date.getTimezoneOffset();
       System.out.println("aa:" + aa);
       Date date3 = (Date)date2.clone();
       int hashCode = date2.hashCode();
       System.out.println("date3:" + date3);
       System.out.println("hashCode:" + hashCode);
       
       //int result = date2.compareTo(date);
       //  boolean result = date2.before(date);
       //boolean result = date2.after(date);
       boolean result = date2.equals(date);
       System.out.println("result:" + result);
       
       
       // 使用 toString() 函数显示日期时间
       System.out.println(date.toString());
       System.out.println(date.getTime());
       
       SimpleDateFormat fr = new SimpleDateFormat("Eyyyy/MM/dd'at'HHmmssSSazzz");
       String dNow = fr.format(date);
       System.out.println("dNow:" + dNow);
       SimpleDateFormat fr1=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss:SS FEDwW zzz");
       String mNow=fr1.format(date);
       System.out.println("mNow:"+mNow);
       
       TimeZone zone = fr.getTimeZone();
       System.out.println("zone:"+zone.getID());
       
       
       Locale locale = null;
       
       
       Locale myLocale = Locale.getDefault();
       System.out.println(myLocale.getCountry());
       System.out.println(myLocale.getLanguage());
       System.out.println(myLocale.getDisplayCountry());
       System.out.println(myLocale.getDisplayLanguage());
       
       System.out.println(Locale.US.getLanguage());
       
       
       
       
	}
}
