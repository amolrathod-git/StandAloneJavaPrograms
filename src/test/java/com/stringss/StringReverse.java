package com.stringss;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="abc";
		String nstr= "";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
			nstr=nstr+str.charAt(i);
			
		}
		
		System.out.println(nstr);
	}

}
