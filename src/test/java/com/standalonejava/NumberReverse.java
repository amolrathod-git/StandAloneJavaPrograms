package com.standalonejava;

public class NumberReverse {

	public static void main(String[] args) {

		int n = 1000;

		int reversedNumber= reverseNum(n);
		System.out.println(reversedNumber);

	}

	private static int reverseNum(int n) {

		int rev=0;
		int rem;

		while(n>0){
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}

		return rev;

	}

}
