//Write a program to find the sum of 10 numbers from 10(ie. 10 to 19)
package com.k2js.loops.practice;

class Sum{
	public static void m(){
		int sum=0;
		for(int i=10;i<20;i++)
			sum = sum+i;
			System.out.println(sum);
	}
}
class SumTest{
	public static void main(String...abc){
		Sum.m();
	}
}
