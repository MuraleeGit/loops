//finding the biggeest digit in a number

package com.k2js.loops.practice;

class consProg1{
	public static void main(String...abc){
		System.out.println(1000+2000);
	}
}

//javac -d ..\bin com\k2js\loops\practice\Loops28.java
//java -cp ..\bin com.k2js.loops.practice.NumDigitsTest
/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>javap -p -c -cp ..\bin com.k2js.loops.practice.consProg1
Compiled from "Loops29.java"
class com.k2js.loops.practice.consProg1 {
  com.k2js.loops.practice.consProg1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String...);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: sipush        3000
       6: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
       9: return
}
*/
