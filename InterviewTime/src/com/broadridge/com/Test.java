package com.broadridge.com;

public class Test extends Object {

		static public void main(String[] args) {
			test(null);
		}

		public static void test(Object o) {
			System.out.println("Object argument");
		}

		public static void test(String s) {
			System.out.println("String argument");
		}
	}

