//Print A B C D E  if you give 8. First 5 line after that the rmaining.
//		A B C D E

package com.k2js.loops.practice;

class Pattern4Logic{
	public static void m(){
		for(int row=0;row<5;row++,System.out.println()){
			char c='A';
			for(int cell=0;cell<5;cell++)
				System.out.print(c++);
		}
	}
	
}
class Pattern4LogicTest{
	public static void main(String...abc){
		Pattern4Logic.m();	
	}
}