package com.sanjib.test;

public class Test {
	/*
	 * Test(int a, int b) {
	 * System.out.println("Init param Constructor"+"a = "+a+" b = "+b); }
	 */
	    Test(int a, float b)  
	    {  
	        System.out.println("a = "+a+" b = "+b);  
	    }  
	    public static void main (String args[])  
	    {  
	        byte a = 10;   
	        byte b = 15;  
	        Test test = new Test(a,b);  
	        
	        System.out.println(10+2+"Executed");
	        System.out.println("Executed"+10+2);
	    } 
	
	public static void main1(String[] args) {
		Address addressOne=new Address("Medinipur", "Garhbeta", "71212", "Kolkata", "West Bengal");
		Address addressTwo=new Address("Birbhum", "Garhbeta", "71212", "Kolkata", "West Bengal");
		
		Employee empOne=new Employee("Sanjib", "Pan", "Male", 28, "12-10-1994", addressTwo);
		
		
		
		
	}

}
