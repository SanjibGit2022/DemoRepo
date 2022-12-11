package com.comviva.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestNumFromArray {

	public static void main(String[] args) {

		Integer[] numArr = {10,50, 30, 20, 40};
		System.out.println("length:" + numArr.length);
		int temp = 0;
		for (int i = 0; i < numArr.length; i++) {

			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] > numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}

			}
			// numArr[j] = numArr[i];//[50,40, 30,20,10] } // if } // for

			System.out.print(numArr[i] + " " + "\n");
		} // for
		System.out.println(
				"Length of the array is: " + numArr.length + " 2nd largest Number: " + numArr[numArr.length - 2]);
		System.out.println("***************Using Java 8*************");
		List<Integer> arrList = Arrays.asList(numArr);
		int nthLargestNum = arrList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(nthLargestNum);
		List<Integer> numList = arrList.stream().sorted().collect(Collectors.toList());
		System.out.println(numList);
	}
}
