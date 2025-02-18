package com.mypractice;

import java.util.regex.Pattern;

public class FindNumberOfOccurancesOfSubString {
    public static void main(String[] args){
        FindNumberOfOccurancesOfSubString obj =new FindNumberOfOccurancesOfSubString();
        //aabbabbabbhiajhavjavhiaabch
        String input="hihihihiabchia";
        String keyword="hi";

        obj.findOccurance( input,  keyword);
    }
    private void findOccurance(String input, String keyword) {

        int iLength=input.length();
        int keyLength=keyword.length();
        int count=0;
         for (int i=0;i<iLength;i++){

             if(input.charAt(i)==keyword.charAt(0) ){
                    for(int j=0;j<keyLength;j++){
                          if(input.charAt(i)==keyword.charAt(j) )
                          {
                              i++;
                              if (j==keyLength) count++;

                          }else{ i--;break;}
                      }


                      }

        }

        System.out.println("occurance is "+count);
    }


    public void findOccurance1(String input, String keyword){
        int iLength=input.length();
        int keyLength=keyword.length();
        int count=0;

        for (int i=0;i<iLength-keyLength+1;i++){

            if(input.charAt(i)==keyword.charAt(0)){
                String nstr= input.substring(i,i+keyLength);
                if(nstr.equals(keyword)) {
                    i = i + keyLength-1;
                    count++;
                }
            }


        }
        System.out.println("occurance is "+count);

    }

    public void findOccurance3(String input, String keyword){
        int iLength=input.length();
        int keyLength=keyword.length();
        int count=0;
        int j=0;
        for (int i=0;i<iLength;i++){

            if(input.charAt(i)==keyword.charAt(j)){

                if(j==keyLength-1)
                {
                    count++;
                    j=0;
                    continue;
                }

                j++;
            }else j=0;




        }
        System.out.println("occurance is "+count);

    }


}
