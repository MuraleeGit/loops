//Loops printing five stars ***** . We are writing without for loop using the utility.

package com.k2js.loops.practice;

class Loops6{

	public static void m(){

	java.util.stream.IntStream.range(0,5).forEach((x)->System.out.println("*"));
	
	}

}
class Loops6Test{
	public static void main(String...abc){
		Loops6.m();
	}
}


//There is an inbuilt method already available 
//java.util.stream.IntStream.range