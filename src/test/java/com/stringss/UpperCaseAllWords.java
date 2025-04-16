package com.stringss;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseAllWords {


    public static void main(String[] args) throws IOException {
        String input="amol rathod";

        input=(char)(input.charAt(0)-32)+input.substring(1);
        System.out.println(input);

        char[] arr=input.toCharArray();

        for (int i=0;i<input.length();i++)
        {
            if (arr[i]==(char)32)

                        arr[i+1]=(char)(arr[i+1]-32);

        }
        //input=String.valueOf(arr);

        System.out.println(arr);

        String secInput="abhishek pawar";

        UpperCaseAllWords newObj=new UpperCaseAllWords();
        newObj.upperCaseUsingStream(secInput);

    }

    private void upperCaseUsingStream(String input) throws IOException {

        String[] myArray=input.split("\\s");
        String output=Arrays.stream(myArray)
                .map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(output);

        //String jsonContent= FileUtils.readFileToString(new File("C:\\Users\\amolr\\Pictures\\My pic white back.jpg"), StandardCharsets.UTF_8);
        //System.out.println(jsonContent);
    }
}
