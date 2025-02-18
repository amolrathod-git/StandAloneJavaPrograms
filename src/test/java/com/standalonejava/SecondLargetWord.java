package com.standalonejava;

import java.util.ArrayList;
import java.util.List;

public class SecondLargetWord {

    public static void main(String[] args) {
        SecondLargetWord secHigh = new SecondLargetWord();
        int lengSec= secHigh.findOString("This is english statement output abcdefghi");

        System.out.println(lengSec);

        secHigh.tryArrayList();

    }

    public int findOString(String input) {
        List<Integer> lenghthList = new ArrayList<Integer>();

        String[] strArray = input.split(" ");



        for (int i = 0; i < strArray.length; i++) {


            int len = strArray[i].length();
            lenghthList.add(len);


        }


        int highest = Integer.MIN_VALUE;
        int secHighest = Integer.MIN_VALUE;

        int markIndex = 0;
        for (int j = 0; j < lenghthList.size(); j++) {

            if (lenghthList.get(j) > highest) {
                secHighest = highest;
                highest = lenghthList.get(j);
                markIndex=j;

            } else if (lenghthList.get(j) > secHighest && highest > secHighest && !(lenghthList.get(j)==highest)) {
                secHighest = lenghthList.get(j);
                markIndex=j;
            }

        }
        System.out.println(strArray[markIndex]+" with length "+secHighest);
        return secHighest;
 }

 public void tryArrayList(){
        ArrayList newList=new ArrayList();
        newList.add("Amol");
        newList.add("Gourav");
        newList.add(5);
     System.out.println(newList);
    }


}

