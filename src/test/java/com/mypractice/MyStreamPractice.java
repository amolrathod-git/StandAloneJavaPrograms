package com.mypractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyStreamPractice{


        public static void main(String[] args)
        {
            MyStreamPractice a=new MyStreamPractice();
            a.findStream();


        }

        public void findStream()
        {

            List<String> myList=new ArrayList<>();
            myList.add("Amol");
            myList.add("Amol1");
            myList.add("smol");
            myList.add("smol");

            List<String> myNewList = myList.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
            myNewList.forEach(MyStreamPractice::strOp);

            Map<String, Long> result
                    = myList.stream().collect(
                    Collectors.groupingBy(
                            Function.identity(),
                            Collectors.counting()));



        }

    public static void strOp(String s) {
            StringBuilder strB=new StringBuilder(s);
            strB.append(" Rathod");
        System.out.println(strB);
        String a="Test";
        System.out.println(a.compareTo("test"));
    }






        }


