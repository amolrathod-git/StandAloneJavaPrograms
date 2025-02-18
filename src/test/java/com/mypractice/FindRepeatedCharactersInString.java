package com.mypractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatedCharactersInString {

    public void usingASCIIvalue(String s){

        int[] freq=new int[126];

        char[] strArray=s.toCharArray();

        for (char ch:strArray)
            freq[ch]++;

            for (int i=32;i<126;i++){
                if(freq[i]>1)
                {
                    System.out.println("character "+(char)i+" repeated for"+freq[i]+"times");
                }
            }
    }

    public void usingHashMap(String s){

        Map<Character, Integer> count=new HashMap<Character, Integer>();

        for(char ch:s.toCharArray()){
            if(count.containsKey(ch)){
                count.put(ch, count.get(ch)+1);
            }
            else{
                count.put(ch, 1);
            }
        }

        Collection<Character> keys=count.keySet();


        for(Character ch:keys ){
            if (count.get(ch)>1)
                System.out.println(ch+""+count.get(ch));
        }

        for (Map.Entry<Character, Integer> iterator:count.entrySet())
        {


            if (iterator.getValue()>1)
            System.out.println(iterator.getKey()+" "+iterator.getValue());
        }


    }




    public static void main(String[] a){
        FindRepeatedCharactersInString findRepeated=new FindRepeatedCharactersInString();
        findRepeated.usingASCIIvalue("aaabbccccc");
        findRepeated.usingHashMap("aaabbccccc");

    }

}
