package com.mypractice;

public class SwapCharPairs {

    SwapCharPairs(String a){


        char[] b=a.toCharArray();

        for(int i=0;i<b.length-1;i=i+2){
            char temp = b[i];
            b[i]=b[i+1];
            b[i+1]=temp;
        }
        System.out.println(b);
    }

    public static void main(String[] args){
        new SwapCharPairs("ababababc");
    }

}
