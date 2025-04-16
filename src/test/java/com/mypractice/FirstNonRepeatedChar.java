package com.mypractice;

public class FirstNonRepeatedChar {

    
        public static void main(String args[]) {
            String s="abcd abcd xyz";
            char c = firstnonRepeatedChar(s);
            System.out.println(c);
        }

        public static char firstnonRepeatedChar(String s){

            int[] freq=new int[126];




            for (char ch: s.toCharArray()){
                freq[ch]++;


            }

            char found = 0;
            for (char ch: s.toCharArray()){
                if (freq[ch]==1&&!(ch==' ')){
                    found=ch;
                    break;


                }

            }
            return found;
        }





    
    
    
}
