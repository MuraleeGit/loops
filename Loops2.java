//Loops printing five stars *****

package com.k2js.loops.practice;

class Loops2{

	public static void m(){
	int c=0;
	for( ; ; )
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
