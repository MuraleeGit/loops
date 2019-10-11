//Loops printing five stars ***** writing the initialization inside for.

package com.k2js.loops.practice;

class Loops2{

	public static void m(){

	for(int c=0 ; ; )
		if(c++<5){
			System.out.println("*");
		}
		else
			break;
		System.out.println("hello");
	}
	
}
class Loops2Test{
	public static void main(String...abc){
		Loops2.m();
	}
}
