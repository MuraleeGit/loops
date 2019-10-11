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

class PVLogic{
	public static void p(int num){
		int c=digitCount(num);
		for( ; num!=0; num%=c){
			System.out.println((num/10)*(int)Math.pow(10,--c));
		}
		
	}
}

class PVlogicTest{
	public static void main(String...abc){
		//int r= PV.get10power(7);
		//System.out.println(r);
		PVLogic.p(234567);
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
