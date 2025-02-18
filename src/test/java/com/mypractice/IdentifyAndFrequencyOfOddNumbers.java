package com.mypractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IdentifyAndFrequencyOfOddNumbers {

    public static void main(String[] args){

        int[] array ={1,5,5,8,8,7,5,3};

        IdentifyAndFrequencyOfOddNumbers identifyAndFrequencyOfOddNumbers =new IdentifyAndFrequencyOfOddNumbers();
        identifyAndFrequencyOfOddNumbers.find(array);

    }

    public  void find(int[] array){
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();

        for(int num:array)
        {
            if(num%2!=0){
                if(map.containsKey(num))
                map.put(num, map.get(num)+1);
                else map.put(num, 1);
            }

        }

        for (Map.Entry<Integer,Integer> iter : map.entrySet()){
            System.out.println("number "+iter.getKey()+" is repeated for "+iter.getValue()+" times");
        }

    }

}
