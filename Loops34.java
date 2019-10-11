//finding the reverse of a number

package com.k2js.loops.practice;

class Reverse{
	public static int rev(int num){
		int rev=0;
		for( ;num!=0; ){
			int digit =num%10;
			rev=rev*10+digit;
			num/=10;
		}
	return rev;
	}
		
    
}

class ReverseTest{
	public static void main(String...abc){
		int r=Reverse.rev(2345);
		System.out.println(r);
	}
}

//The result is 5432


