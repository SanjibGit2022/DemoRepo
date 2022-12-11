package com.teytest.inter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EYTest {
	//write a program of occurrence of each char of string
	public static void main(String[] args) {
		String str="saanjib";
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			int cnt=0;
			int elsCount=0;
			for(int j=1; j<str.length(); j++) {
				if(ch[i]==ch[j]) {
					cnt++;
					break;
					
				}//if
				else {
					elsCount++;
					break;
				}//else
			}//for
			//System.out.println("char occurence for "+ch[i]+" is "+cnt);
			//System.out.println("char occurence for "+ch[i]+" is "+elsCount);
		}
		//str.chars().collect(Collectors.groupingBy(String.valueOf(), Collectors.counting()));
		//str.chars().filter(i->i.)
		//.map(String::toLowerCase)
		Map<String, Long> result=Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,HashMap::new , Collectors.counting()));
		System.out.println(result);

	}//main(-)
	 

}//