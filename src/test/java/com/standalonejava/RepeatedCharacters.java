package com.standalonejava;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedCharacters {

    public static void countRepeatedChars(String str) {
        // Array to store the frequency of characters (ASCII 256)
        int[] freq = new int[256];


        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        char c='b';
        int[] pqr=new int[150];
        System.out.println(++pqr[c]);

        // Count and display the repeated characters
        int repeatedCount = 0;
        System.out.println("Repeated characters and their frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println("'" + (char) i + "' appears " + freq[i] + " times");
                repeatedCount++;
            }
        }

        System.out.println("Total number of repeated characters: " + repeatedCount);
    }

    public void RepeatedCharacters1(String s){



    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        countRepeatedChars(input);

        scanner.close();
    }

}
