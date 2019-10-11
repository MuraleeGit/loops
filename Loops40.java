//6234567 - Nth highest number ->Very very impotant program.

package com.k2js.loops.practice;

class Nthhighest{
	public static void nthHighest(int num,int h){
		int on=num, high=0;
		for(	;num!=0;	){
			int digit=num%10;
			high=(high<digit)?digit:high;
			num/=10;
		}
		num=on;
		for(int ite=1;ite<h;ite++){
			int nhigh=num%10;
			for(	;num!=0;num/=10){
				int digit=num%10;
				nhigh=(nhigh<digit)&&(digit<high)?digit:nhigh;
			}
			high=nhigh;
		}
		System.out.println(high);
	}
	
}
class NthhighTest{
	public static void main(String...abc){
	
	Nthhighest.nthHighest(764583,2);
	}
}
	


