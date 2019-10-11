//

package com.k2js.loops.practice;

class Pattern6Logic{
	public static void m(){
		for(int row=0;row<5;row++,System.out.println()){
			char c='A';
			for(int cell=0;cell<=row;cell++)
				System.out.print(c++);
		}
	}
	
}
class Pattern6LogicTest{
	public static void main(String...abc){
		Pattern6Logic.m();	
	}
}


// D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>java -cp ..\bin  com.k2js.loops.practice.Pattern6LogicTest
// A
// AB
// ABC
// ABCD
// ABCDE
