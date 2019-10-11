//Write a program to print 0.1 to 0.5
package com.k2js.loops.practice;

class Points{
	public static void m(){
		
		for(double d=0.1; d<=0.5;d+=0.1)
			System.out.println(d);
	}
}
class PointsTest{
	public static void main(String...abc){
		Points.m();
	}
}

