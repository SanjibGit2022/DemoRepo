package com.inter.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNum {
	
		public static void main(String[] args) {
			List<Integer> list=Arrays.asList(1,2,3,4,6,7,5);
			
			List<Integer> evenList= list.stream().filter(i->i%2==0).collect(Collectors.toList());

			List<Integer> oddList= list.stream().filter(i->i%2!=0).collect(Collectors.toList());
			
			
			System.out.println("Even Num: "+evenList+ " Odd num:"+oddList);
		}
}
