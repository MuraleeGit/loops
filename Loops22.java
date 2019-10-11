//Program 21 in switch statement
package com.k2js.loops.practice;

class WeekDay{
	public static void m(int n){
	switch(n){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println(" Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		case 8:
		default:
			System.out.println("no day");
	}
	}
}

class WeekDayTest{
	public static void main(String...abc){
		WeekDay.m(4);
	}
}