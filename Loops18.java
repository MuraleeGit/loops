//Write a program to print the length of the number 47652
package com.k2js.loops.practice;

class Test{
	public static void m(){
		int num=47652;
		int count=0;
		for(;num!=0;){
			num=num%10;
			count++;
		}
			System.out.println(count);
	}
}
class TestTest{
	public static void main(String...abc){
		Test.m();
	}
}

//Home work- generate any randomng nuymber from 0 to 5000 and find out how many digits are there in that number.
//find out the biggest diit in a number//generate a number below 50 and check that number is prime or not.
//write a program to print first 10 even number from 50
//