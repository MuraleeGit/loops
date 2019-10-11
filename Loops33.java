//finding the sum of digits in a number until we get single digit

package com.k2js.loops.practice;

class Sumdigits{
	public static int digitSum(int num){
		int sum =0;
		for( ;num!=0; ){
			int digit =num%10;
			sum+=digit;
			num/=10;
			if(num==0 &&sum>=10){
				num=sum;
				sum=0;
			}
		}
		return sum;
    }
}

class SumdigitsTest{
	public static void main(String...abc){
		int r=Sumdigits.digitSum(2345);
		System.out.println(r);
	}
}

//The result is 5


