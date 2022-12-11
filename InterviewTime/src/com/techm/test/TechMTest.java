package com.techm.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TechMTest {
	public static void main(String[] args) {
		String input = "ABCCDEFFG";
		
		Map<String, Long> result=Arrays.stream(input.split("")).collect(Collectors.groupingBy(s->s,HashMap::new,Collectors.counting()));
		System.out.println(result);
	}

}
