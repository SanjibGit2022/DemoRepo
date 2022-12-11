package com.sanjib.inter.test;

import java.util.*;
//import java.util.HashMap;
//import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		       String str="good for good";
		       //ouput good 2 for 1;
		       Map<String, Long> result=Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s, HashMap::new, Collectors.counting()));
		       System.out.println(result);
		    }


}
