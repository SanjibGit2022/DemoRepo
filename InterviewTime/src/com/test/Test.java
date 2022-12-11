package com.test;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String s="ramalingam";
		String[] str=s.split("");
		List<String> lststr=Arrays.asList(str);
		String s1=lststr.stream().filter(i->lststr.indexOf(i)==lststr.lastIndexOf(i)).skip(1).findFirst().get();
		System.out.println(s1);
	}

}
