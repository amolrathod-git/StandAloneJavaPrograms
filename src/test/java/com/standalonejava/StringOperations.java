package com.standalonejava;

public class StringOperations {

    public static void main(String[] args ){


        String s1= new String("Sachin");
        s1.concat("Tendulkar");

        System.out.println(s1);

        StringBuilder a1 = new StringBuilder("Sachin");
        a1.substring(4);
        System.out.println(a1);

    }

}
