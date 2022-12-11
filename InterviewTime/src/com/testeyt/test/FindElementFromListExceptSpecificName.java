package com.testeyt.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementFromListExceptSpecificName {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("A", "B","D", "C");//[A, B, D] except C
		
		List<String> list= l.stream().filter(i->!i.equalsIgnoreCase("C")).collect(Collectors.toList());
		System.out.println(list);
	}
	
	

}
