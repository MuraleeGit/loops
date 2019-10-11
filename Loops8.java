//Loops printing five stars ***** . We are writing without for loop using the utility.

package com.k2js.loops.practice;


import static java.util.stream.IntStream.range;// the static keyword is very much important here.

class Loops8{

	public static void m(){

	range(0,5).forEach((x)->System.out.println("*"));
	
	}

}
class Loops8Test{
	public static void main(String...abc){
		Loops8.m();
	}
}


//There is an inbuilt method already available 
//java.util.stream.IntStream.range