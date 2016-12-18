package com.it.enumeration.study;

import java.util.Calendar;

public class Test {
	
	private void printCurrentDay(){
		Calendar cal = Calendar.getInstance();
		int weekCount = cal.get(cal.DAY_OF_WEEK);
		WeekDay weekDay = WeekDay.Mon;
		weekDay.printDay(weekCount);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         Test test = new Test();
         test.printCurrentDay();
	}

}
