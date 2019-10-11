//Write a program to print 1 to 10 for comparabale.
package com.k2js.loops.practice;

class Test{
	public static void m(){
		
		for(Comparable c=1;((Integer)c)<10;((Integer)c++))
			System.out.println(c);
	}
}
class PointsTest{
	public static void main(String...abc){
		Test.m();
	}
}

/// not working we ned to see