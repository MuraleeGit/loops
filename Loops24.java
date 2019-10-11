//Input number 546327
/* output
7
20
300
6000
40000
500000
*/
package com.k2js.loops.practice;

class PVprint{
	public static void m(int num){
		int tens=1;
		for ( ;num!=0; ){
			int digit = num%10;
			int pv=digit*tens;
			System.out.println(pv);
			num /=10;
			tens *=10;
			
		}
	}
}

class PVlogicTest1{
	public static void main(String...abc){
		//int r= PV.get10power(7);
		//System.out.println(r);
		PVprint.m(234567);
	}
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>java -cp ..\bin com.k2js.loops.practice.PVlogicTest
7
60
500
4000
30000
200000
*/
