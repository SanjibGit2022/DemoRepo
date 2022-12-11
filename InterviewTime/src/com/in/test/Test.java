package com.in.test;

public class Test {
	
	public static void main(String[] args) {
	String	input = "Four Tw Fives Thr"; //output : Tw Thr Four Fives
	String[] strArr=input.split(" ");
	String neStr="";
	
	for(int i=0; i<strArr.length; i++) {
		
		for(int j=i+1; j<strArr.length; j++) {
			if(strArr[i].toCharArray().length>strArr[j].toCharArray().length) {
				String temp=strArr[i];
				strArr[i]=strArr[j];
				strArr[j]=temp;
				//neStr+=strArr[j];
				//neStr.join("", strArr[i]);
			}
			//neStr+= String.join(" ",strArr );
		}
		//neStr.join("", strArr[i]);
	//System.out.println(strArr[i]);	
	}
	neStr.join("", strArr);
	
	System.out.println(neStr);
	}

}
