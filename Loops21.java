//Write a program to print first 10 even numbers from 50
package com.k2js.loops.practice;

class WeekDay{
	public static void m(int n){
		if(n==1 || n==2 || n==3|| n==4 ||n==5){
			System.out.println("Weekay or working day" +n);
		}else if(n==6 || n==7){
			System.out.println("Weekend off" +n);
		}else{
			System.out.println("No day" +n);
		}
	}
}

class WeekDayTest{
	public static void main(String...abc){
		WeekDay.m(-30);
	}
}