package com.it.enumeration.study;

public enum WeekDay {
	 Mon("Monday"),
	 Tue("Tuesday"), 
	 Wed("Wednesday"), 
	 Thu("Thursday"), 
	 Fri( "Friday"), 
	 Sat("Saturday"), 
	 Sun("Sunday"),
	 Week;
	 private String day; 
	 WeekDay(){} 
	 WeekDay(String dayArg) { 
	     day = dayArg; 
	 } 
	 public void printDay(int i){ 
	   switch(i){ 
		   case 1: System.out.println(WeekDay.Mon); break; 
		   case 2: System.out.println(WeekDay.Tue);break; 
		   case 3: System.out.println(WeekDay.Wed);break; 
		   case 4: System.out.println(WeekDay.Thu);break; 
		   case 5: System.out.println(WeekDay.Fri.day);break; 
		   case 6: System.out.println(WeekDay.Sat);break; 
		   case 7: System.out.println(WeekDay.Sun);break; 
		   default:System.out.println("wrong number!"); 
		 } 
	 } 
	 public String getDay() { 
		return day; 
	 } 
	 
	 public static void main(String[] args){
		 System.out.println(22);
	 }
}
