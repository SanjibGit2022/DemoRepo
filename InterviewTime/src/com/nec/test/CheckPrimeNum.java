package com.nec.test;

public class CheckPrimeNum {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14,15};
		//isPrimeForArray(intArr);
		//isPrimeForArrayNew(intArr);
		isPrimeForAll(intArr);
		System.out.println(isPrime(3));
		//System.out.println(3%2==0);
	}//main

	public static void isPrimeForArray(int[] intArr) {
		for (int i = 0; i <=intArr.length - 1; i++) {
			for (int j = 2; j <= intArr[i]; j++) {
				if (intArr[i] % j == 0) {
					System.out.println(intArr[i]+ " is not prime");;
				}else
					System.out.println(intArr[i]+" is  prime");
				break;
			}
			//System.out.println(intArr[i]+" is  prime");
		}
	}
	public static boolean isPrime(int num) {
			for (int j = 2; j <= num; j++) {
				if (num % j == 0) {
					return false;
				}
			}

		return true;
	}//
	
	public static void isPrimeForAll(int[] intArr) {
		for (int i = 0; i <=intArr.length - 1; i++) {
			if(isPrime(intArr[i])) {
				System.out.println("prime number is: "+intArr[i]);
			}else
				System.out.println("not prime number is: "+intArr[i]);
		}
	}
	public static void isPrimeForArrayNew(int[] intArr) {
		for (int i = 0; i <=intArr.length - 1; i++) {
			for (int j = 1; j <= intArr[i]; j++) {
				if (intArr[i] % j == 0  && intArr[i]/2!=1) {
					System.out.println(intArr[i]+ " is not prime");;
				}else
					System.out.println(intArr[i]+" is  prime");
				break;
			}
		}
	}

}
