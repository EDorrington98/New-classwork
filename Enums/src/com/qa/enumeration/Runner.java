package com.qa.enumeration;

public class Runner {

	public static void main(String[] args) {
		Day day = Day.MONDAY;
		
		
		switch (day) {

		case MONDAY:
			System.out.println(day.getFeeling());
			break;
		case TUESDAY:
			System.out.println(day.getFeeling());
			break;
		case WEDNESDAY:
			System.out.println(day.getFeeling());
			break;
		case THURSDAY:
			System.out.println(day.getFeeling());
			break;
		case FRIDAY:
			System.out.println(day.getFeeling());
			break;
		case SATURDAY:
			System.out.println(day.getFeeling());
			break;
		case SUNDAY:
			System.out.println(day.getFeeling());
			break;
		}

	}
}
