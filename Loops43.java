//Print *****  if you give 8. First 5 line after that the rmaining.
//		***

package com.k2js.loops.practice;

class Pattern3Logic{
	public static void m(int StarCount){
		for(int i=1;i<=StarCount;i++){
		System.out.print((i%5==0)?"*\n":"*");
		}
	}
	
}
class Pattern3LogicTest{
	public static void main(String...abc){
		Pattern3Logic.m(17);	
	}
}