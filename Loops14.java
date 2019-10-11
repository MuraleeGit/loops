//Write a program to print A to Z
package com.k2js.loops.practice;

class Print{
	public static void m(){
		for(char c='A';c<='Z';c++)
			System.out.println(c);
	}
}
class PrintTest{
	public static void main(String...abc){
		Print.m();
	}
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>javac -d ..\bin com\k2js\loops\practice\Loops14.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\loops\src>java -cp ..\bin  com.k2js.loops.practice.PrintTest
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
*/