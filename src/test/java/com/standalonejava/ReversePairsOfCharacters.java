package com.standalonejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversePairsOfCharacters {

public void revPairsChar(String str){

    int length= str.length();
    char[] strArray=str.toCharArray();



    for(int i=0;i<length-1;i+=2){
        char temp;
        temp=strArray[i];
        strArray[i]=strArray[i+1];
        strArray[i+1]=temp;

    }

    System.out.println(Arrays.toString(strArray));

    System.out.println(strArray);


}

public static void main(String[] a){

    ReversePairsOfCharacters obj=new ReversePairsOfCharacters();

    obj.revPairsChar("abcdef");


}


}
