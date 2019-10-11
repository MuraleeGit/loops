//Print A B C D E  if you give 8. First 5 line after that the rmaining.
//		A B C D E

package com.k2js.loops.practice;

class Pattern5Logic{
	public static void m(){
		for(int row=0;row<5;row++,System.out.println()){
			char c='A';
			for(int cell=0;cell<5-row;cell++)
				System.out.print(c++);
		}
	}
	
}
class Pattern5LogicTest{
	public static void main(String...abc){
		Pattern5Logic.m();	
	}
}