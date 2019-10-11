//6234567 - Replace even number with 1.

package com.k2js.loops.practice;

class ReplaceEven1{
	public static void m(int num){
		int newNumber=0;
		for(	;num!=0;	){
			int tens=1;
			int newNum=1;
			for(int n=num/10;n!=0;n/=10){
				tens=tens*10;
			}
			int digit=num/tens;
			if(digit%2==0){
				digit=1;
			}
			newNumber=newNumber+(digit*tens);
			num=num%tens;
		}
		System.out.println(newNumber);
	}
	
}
class ReplaceEven1Test{
	public static void main(String...abc){
		ReplaceEven1.m(8757567);
	}
}
