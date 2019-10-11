//To check whether the number is prime or not.

package com.k2js.loops.practice;

class Prime{
	
	public static String m(int num){
		int fc=0;
		for(int i=1; i<=num/2;i++){
			fc = (num%i==0)?++fc:fc;//If the condition is tru, it will execute the ? mark part.If the condition not satisfiedit will execute the : part
		}
		return((fc==1)?"Prime":"Not Prime");
	}
}

class PrimeTest{
	
	public static void main(String...abc){
		String r=Prime.m(7);
		System.out.println(r);
		
	}
}
