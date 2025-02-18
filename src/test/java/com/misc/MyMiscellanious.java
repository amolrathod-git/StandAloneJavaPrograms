package com.misc;

import java.util.*;

public class MyMiscellanious {

    public static void main(String[] args){

        String myString="I am amol rathod abcdef with anything";

        String[] strArray=myString.split(" ");

        Arrays.sort(strArray, (a,b)->(a.length()-b.length()));

        System.out.println(strArray[strArray.length-1]);

        System.out.println(Arrays.asList(strArray));

        TreeMap<Integer, String> myMap=new TreeMap<>();
        for(int i=0;i<strArray.length;i++){
            myMap.put(strArray[i].length(), strArray[i]);
        }
        System.out.println(myMap);

        myMap.remove(myMap.lastEntry().getKey());

        System.out.println(myMap.lastEntry());




        Set<Integer> set=new TreeSet<>();

        for(int i=0;i<strArray.length;i++){
            set.add(strArray[i].length());
        }





        System.out.println(set);




    }


    public static void testArrayTypeSafety() {


        String[] strings = new String[3];
        Object[] objects = strings;
        objects[0] = 4;
        System.out.println(objects[0]);

        ArrayList<String> stringsal = new ArrayList<>();
        //ArrayList<Object> objectsal=stringsal;


    }

}
