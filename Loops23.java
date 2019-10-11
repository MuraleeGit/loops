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


class PV{
	public static int get10power(int digit){
		int ten=1;
		for(int i=1;i<digit;i++){
			 ten *=10;//ten=ten*10
		} 
		return ten;
	}
	
}
class PVlogic{
	public static void m(int num){
		int placeNo=1;
		for ( ;num!=0; ){
			int digit = num%10;
			num /=10;
			System.out.println(digit*PV.get10power(placeNo++));
			
		}
	}
}

class PVlogicTest{
	public static void main(String...abc){
		//int r= PV.get10power(7);
		//System.out.println(r);
		PVlogic.m(234567);
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
