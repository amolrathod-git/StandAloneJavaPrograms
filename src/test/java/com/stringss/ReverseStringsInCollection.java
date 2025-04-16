package com.stringss;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;

public class ReverseStringsInCollection {


        public static void main(String[] args) {


            String str= "Amol, is doing programming9 practices";

            String[] subStr=str.split("\\d");



            // System.out.println(a);
            ArrayList<String> Sentence = new ArrayList<String>(Arrays.asList(subStr));
            System.out.println(Sentence);

            Collections.reverse(Sentence);

            String b=String.join(" ", Sentence);

            System.out.println(b);




           for (int i=Sentence.size()-1;i>=0;i--){


               System.out.println(Sentence.get(i)+" ");


            }

            System.out.println(Pattern.matches("^[geks]*",
                    "geeksgeeks"));


        }

}
