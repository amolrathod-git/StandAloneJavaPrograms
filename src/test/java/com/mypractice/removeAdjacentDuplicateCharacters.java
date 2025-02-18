package com.mypractice;

public class removeAdjacentDuplicateCharacters {

    public  static void main(String[] args){

        String s="xyzzzzaxzbbbzzxx";

        removeAdjacentDuplicateCharacters obj= new removeAdjacentDuplicateCharacters();
        System.out.println(obj.removeDups(s));

    }

    private String removeDups(String s) {

        String nstr="";
        for(int i=1; i<s.length(); i++){


            if(s.charAt(i)==s.charAt(i-1)){
                continue;

            }
            nstr=nstr+s.charAt(i);
        }
        return nstr;
    }


}
