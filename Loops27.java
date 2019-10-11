//Input number 546327
/* output
300000
40000
7000
600
50
4
*/
package com.k2js.loops.practice;

class NumDigits{
	
	public static int get10power(int digit){
		int ten=1;
		for(int i=1;i<digit;i++){
			ten =ten*10;
		}
		return ten;
	}
	
	public static int digitCount(int num){
		int c=0;
		for ( ;num!=0;num/=10,c++);
		return c;
	}
	public static void m(int num){
		int dc=NumDigits.digitCount(num);
		int pv=NumDigits.get10power(dc);
		for( ; num!=0; ){
			int digit = num/pv;
			System.out.println(digit*pv);
			num%=pv;
			pv/=10;
		}
	}
}

class NumDigitsTest{
	public static void main(String[] abc){
		NumDigits.m(Integer.parseInt(abc[0]));
	}
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>java -cp ..\bin com.k2js.loops.practice.NumDigitsTest 2147483647
2000000000
100000000
40000000
7000000
400000
80000
3000
600
40
7
*/