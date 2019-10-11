//6234567 - print all prime digits in the number
//checking if the digit is divisible by 1 or more than one number .
//7 = divisible by 1,2,3,4->taking only half

package com.k2js.loops.practice;

class Primedigits{
	 public static void n(int num){
		 for(	;num!=0; num/=10){
			 int digit=num%10,divCount=0;
			 for(int i=1;i<=digit/2;i++){
				 if(digit%i==0){
					 divCount++;
				 }
			 }
			 if(divCount==1)
				 System.out.println(digit);
		 }
	 }
}

class PrimedigitsTest{
	public static void main(String...abc){
		Primedigits.n(769012);
	}
}