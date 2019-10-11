//6234567 - print all digits only once.

package com.k2js.loops.practice;

class Print1{
	public static int getDigitRepetitioncount(int num, int d){
		int c=0;
		for (; num!=0;num/=10 ){
			int digit=num%10;
			if(digit==d){
				c++;
			}
		}
		return c;
	}
	
	public static void n(int num){
		int on=num;
		for( ;num!=0; ){
			int digit=num%10;
			int digitRepCount=getDigitRepetitioncount(num,digit);
			if(digitRepCount==1){
				System.out.println(digit);
			}
			num/=10;
		}
	}

}
class PrintTest{
	public static void main(String...abc){
		Print1.n(6234567);
	}
}

//
/* D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>java -cp ..\bin  com.k2js.loops.practice.PrintTest
7
5
4
3
2
6 */  //ctrl+shift+QName
