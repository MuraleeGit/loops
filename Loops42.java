//Print ***** ->five stars horizontaly if the number is ven and vertical if the number if odd.

package com.k2js.loops.practice;

class Pattern2Logic{
	
	public static void muralee(int StarCount){
		
		for(int i=0;i<StarCount;i++){
			System.out.print("*");
			if(StarCount%2==0){
				System.out.println();//this is just for newline without printing anything
			}
		}
	}
	
}

class Pattern2LogicTest{
	
	public static void main(String...abc){
		Pattern2Logic.muralee(4);
		
	}
}

