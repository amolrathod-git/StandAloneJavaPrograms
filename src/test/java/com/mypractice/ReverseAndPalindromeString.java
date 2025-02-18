package com.mypractice;

import java.util.Arrays;

public class ReverseAndPalindromeString {

    public void reverseTheString(String a){

        String reversedString= "";



        for (int i=a.length();i>0;i--){
            reversedString=reversedString+a.charAt(i-1);

        }
        System.out.println(reversedString);
        if (a.equals(reversedString)) System.out.println("Given String is palindrome");

    }

    public  static void main(String[] abc){
        ReverseAndPalindromeString reverseAndPalindromeString=new ReverseAndPalindromeString();
        reverseAndPalindromeString.reverseTheString("level");
    }

}
