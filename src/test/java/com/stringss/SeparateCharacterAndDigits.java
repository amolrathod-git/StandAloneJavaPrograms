package com.stringss;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateCharacterAndDigits {

    public static void main(String[] args) {

        String str = "112ABC456CDE78";

        ArrayList<String> output = new ArrayList<>();

        Pattern p = Pattern.compile("[A-Z]+|[a-z]+|\\d+");
        Matcher match = p.matcher(str);
        while (match.find()) {

            output.add(match.group());


        }
        System.out.println(output);


        ArrayList<String> digitsList = new ArrayList<>();
        ArrayList<String> letterList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                String startDigit = "";
                int strtDigiCount=0;
                while (Character.isDigit(str.charAt(i))) {
                    startDigit = startDigit + str.charAt(i);
                    strtDigiCount++;
                }
                digitsList.add(startDigit);
                i=i+strtDigiCount-1;
            }
                else if (Character.isDigit(str.charAt(i))) {
                String startLetter = "";
                int startLetterCount=0;
                    while (Character.isAlphabetic(str.charAt(i))) {
                        startLetter = startLetter + str.charAt(i);
                        startLetterCount++;
                    }
                letterList.add(startLetter);
                i=i+startLetterCount-1;


                }


            }

        System.out.println(digitsList);
        System.out.println(letterList);

        }
    }