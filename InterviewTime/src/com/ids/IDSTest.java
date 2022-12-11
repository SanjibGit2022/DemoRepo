package com.ids;

import java.util.HashMap;
import java.util.Map.Entry;

public class IDSTest {
	
	public static void main(String[] args) {
		String s1="sanjib balaji balaji";

		String[] strArr=s1.split(" ");
		
		HashMap<String, Integer> hm= new HashMap<>();
	//	int count=0;
		//System.out.println(strArr.length);
		for(int i=0; i<=strArr.length-1; i++){
			int count=0;
				//int count=hm.get(strArr[i]);
				hm.put(strArr[i],++count);
				//System.out.println(" "+count);
		}
		System.out.println(hm);
		//for (Entry str : hm.entrySet()) {
		//	System.out.println(str.getValue()+" "+count);
			
		//}
	}

}
