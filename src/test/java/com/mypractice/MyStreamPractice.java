package com.mypractice;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
            myList.add("amol");

            //List<String> myNewList = myList.stream().filter(s->(s.startsWith("A")||s.startsWith("a"))).collect(toList());
            List<String> myNewList = myList.stream().map(MyStreamPractice::strOp2).collect(Collectors.toList());
            myNewList.forEach(System.out::println);

            //myNewList.forEach(MyStreamPractice::strOp);

            Map<String, Long> result
                    = myList.stream().collect(
                    Collectors.groupingBy(
                            Function.identity(),
                            Collectors.counting()));





        }

    private static String strOp2(String s) {

            if(s.startsWith("A")||s.startsWith("a")){
                s=s+" Starting with a or A";
            }

        return s;
    }

    public static void strOp(String s) {
            StringBuilder strB=new StringBuilder(s);
            strB.append(" Rathod");
        System.out.println(strB);
        String a="Test";
        System.out.println(a.compareTo("test"));




        }






        }


