package com.mypractice;

import java.io.FileNotFoundException;

public class ExceptionThrow {

    public static void main(String[] args){
        ExceptionThrow obj=new ExceptionThrow();
        try {
            int i=obj.fun();
            System.out.println( i);
        }catch(ArithmeticException e) {

            System.out.println("i am catch from main");
        }
        obj.fun2();
    }



    private int fun()  {

        try{
            throw new ArithmeticException();
        }catch(ArithmeticException e) {
            System.out.println("i am fun catch ");
            throw e;


        }
        finally {

            System.out.println("I am fun finally");
        }

    }
    private void fun2(){
        try {
            fun();
        }


        catch(Exception e){
            System.out.println("catch from fun2");
        }

    }

}
