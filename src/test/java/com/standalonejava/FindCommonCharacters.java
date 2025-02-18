package com.standalonejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonCharacters {

    public String findCommChar(char[] a, char[] b){

        String comm="";
        for(int i=0;i<a.length-1;i++){

            for(int j=0;j<b.length-1;j++){
                if(a[i]==b[j]){

                    comm=comm+a[i];
                }

            }
        }

        return comm;

    }


    public void findCommChar1(char[] a, char[]b){


        int n=a.length;
        int m=b.length;

        HashSet<Character> setFirstArray =new HashSet<>();
        HashSet<Character> setSecondArray =new HashSet<Character>();
        HashSet<Character> setThirdArray =new HashSet<Character>();
        for (char ch: a)
            setFirstArray.add(ch);

        for (char ch:b)
            setSecondArray.add(ch);
        setFirstArray.retainAll(setSecondArray);
        for (char d:setFirstArray)
            System.out.print(d);
        System.out.println("\n"+"---------");
        setThirdArray=setSecondArray;
        for (char f:setThirdArray)
            System.out.print(f);
        System.out.println("\n"+"---------");


        char[] g={'d','f'};
        ArrayList<Character> aList=new ArrayList<Character>();
        for(char c:g)
            aList.add(c);

        for(char e: aList) {
            //aList.add(e);
            System.out.print(e);
        }

    }


public static void main(String[] args){
    FindCommonCharacters obj= new FindCommonCharacters();

    char[] a={'a','b','c','d'};
    char[] b={'a','c','f'};

    //System.out.println(obj.findCommChar(a,b));
    obj.findCommChar1(a,b);
}


}
