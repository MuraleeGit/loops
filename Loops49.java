//the logic here

package com.k2js.loops.practice;

	public static void m(){
		for (int i=0;i<5;i++,System.out.println()){
			char c='A';
			for(int j=0;j<5;j++){
				if(j<5-i-1){
					System.out.print(" ");
				}else{
					System.out.print(c++);
					//System.out.print(c++, +" "); Then triangle will displayed.Check the scond output in the output.					
				}
			}
		}
		
	}
}

class Pattern10LogicTest{
	public static void main(String...abc){
		Pattern10Logic.m();	
	 }
}

