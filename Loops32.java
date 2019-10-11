//finding the sum of digits in a number.

package com.k2js.loops.practice;

class consProg1{
	public static int digitSum(int num){
		int sum =0;
		for( ;num!=0; ){
			int digit =num%10;
			sum+=digit;
			num/=10;
		}
		return sum;
    }
}

class conSProg1Test{
	public static void main(String...abc){
		int r=consProg1.digitSum(2345);
		System.out.println(r);
	}
}


