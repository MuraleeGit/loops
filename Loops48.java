//

package com.k2js.loops.practice;

class Pattern8Logic{
	public static void m(){
		char c='A';
		for(int row=0;row<5;row++, System.out.println()){
			for(int cell=0;cell<3;cell++){
				if(row%2==0){
					System.out.print(c++);
				}else{
					System.out.print(--c);
				}
			}
			c+=3;
		}
		
	}
}

class Pattern8LogicTest{
	public static void main(String...abc){
		Pattern8Logic.m();	
	}
}

