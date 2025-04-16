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

    public void reverseTheStringWithoutUsingExtraString(String b){

        char[] mycharArr=b.toCharArray();

        int left=0;
        int right=mycharArr.length-1;

        while(left<=right){

            mycharArr[left]=(char)(mycharArr[left]+mycharArr[right]);
            mycharArr[right]=(char)(mycharArr[left]-mycharArr[right]);
            mycharArr[left]=(char)(mycharArr[left]-mycharArr[right]);;
            left++;
            right--;



        }


        System.out.println(String.valueOf(mycharArr));



    }



    public  static void main(String[] abc){
        ReverseAndPalindromeString reverseAndPalindromeString=new ReverseAndPalindromeString();
        reverseAndPalindromeString.reverseTheString("level");
        reverseAndPalindromeString.reverseTheStringWithoutUsingExtraString("AMol");

        int x=1;
        int y=5;
        int i = x+= 2 + ++y;
        System.out.println(x+"\t"+i);
    }

}
