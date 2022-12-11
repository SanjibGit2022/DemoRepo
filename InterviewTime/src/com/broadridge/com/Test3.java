package com.broadridge.com;

public class Test3 {
	
	public static void main(String[] args) {
		String str="I am a software Developer";
		String[] strArr=str.split(" ");
		String newStr="";

		for(int i=strArr.length-1; i>=0; i--){
				newStr+=" "+strArr[i];
				
		}
			System.out.println(newStr);
		}
		
	}
