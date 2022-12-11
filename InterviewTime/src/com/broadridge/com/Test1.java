package com.broadridge.com;

import java.math.BigInteger;

public class Test1 {
	
	public static void main(String[] args) {
		Integer i1 = 127; Integer i2 = 127; System.out.println(i1 == i2);//true
		Integer i3 = 128; 
		Integer i4 = 128;
		System.out.println(i3 == i4);//
		
		if(3*0.1 == 0.3) { 
			System.out.println("if");
		}
		else 
			System.out.println("else"+ " 3*0.1="+ (3*0.1));//

	}
}
