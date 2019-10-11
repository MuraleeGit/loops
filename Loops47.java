//

package com.k2js.loops.practice;

class Pattern7Logic{
	public static void m(){
		char c='A';
		for(int row=0;row<5;row++,System.out.println()){
			for(int cell=0;cell<=row;cell++)
				System.out.print(c++);
		}// if you are not writing the Syout inside the loop, you need to write that after this block.
	}
	
}
class Pattern7LogicTest{
	public static void main(String...abc){
		Pattern7Logic.m();	
	}
}



// D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>java -cp ..\bin  com.k2js.loops.practice.Pattern7LogicTes
// A
// BC
// DEF
// GHIJ
// KLMNO

