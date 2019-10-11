//the logic here

package com.k2js.loops.practice;

class Pattern11Logic{
	public static void m(){
		for (int i=0;i<5;i++, System.out.println()){
			int a=1;
			for (int j=0;j<5;j++){
				if(j<5-i-1){
					System.out.print(" ");
				}else{
					System.out.print(a++);
				}
				
			}
		}
	}
}

class Pattern11LogicTest{
	public static void main(String...abc){
		Pattern11Logic.m();	
	 }
}


/* D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>java -cp ..\bin  com.k2js.loops.practice.Pattern11LogicTes
    1
   12
  123
 1234
12345 */
