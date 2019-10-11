//finding the biggeest digit in a number

package com.k2js.loops.practice;

class NumDigits{
	
	public static int findBigDigit(int num){
		int bigDigit=0;
		for( ;num!=0; ){
			int digit =num%10;
			if (digit>bigDigit){
			bigDigit=digit;
			}
		}
		num/=10;
	return bigDigit;
	}
	
}

class NumDigitsTest{
	public static void main(String...abc){
		NumDigits.findBigDigit(35678);
	}
}

//javac -d ..\bin com\k2js\loops\practice\Loops28.java
//java -cp ..\bin com.k2js.loops.practice.NumDigitsTest
