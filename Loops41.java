//Print ***** ->five stars.

package com.k2js.loops.practice;

class Pattern1{
	
	public static void m(){
		System.out.print("*");
	}
}

class Pattern1Logic{
	
	public static void muralee(int StarCount){
		for(int i=0;i<StarCount;i++){
			Pattern1.m();
		}
	}
	
}

class Pattern1LogicTest{
	
	public static void main(String...abc){
		Pattern1Logic.muralee(5);
		
	}
}

