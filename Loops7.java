//Loops printing five stars ***** . We are writing without for loop using the utility.

package com.k2js.loops.practice;


import java.util.stream.IntStream;//import till class name.

class Loops7{

	public static void m(){

	IntStream.range(0,5).forEach((x)->System.out.println("*"));//compare program 6 and 7 you will be able to see the difference
	
	}

}
class Loops7Test{
	public static void main(String...abc){
		Loops7.m();
	}
}


//There is an inbuilt method already available 
//java.util.stream.IntStream.range