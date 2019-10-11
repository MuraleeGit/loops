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

class PVthird{
	public static void p(int num){
		int c=0;
		for ( ;num!=0;num/=10 ){
			System.out.println((num%10)*(int)Math.pow(10,c++));
			
		}
	}
}

class PVlogicTest{
	public static void main(String...abc){
		//int r= PV.get10power(7);
		//System.out.println(r);
		PVthird.p(234567);
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
