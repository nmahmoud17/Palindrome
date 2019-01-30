package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Build a program that will take a word or phrase and check if it is a palindrome. The result should
        // be a boolean value (true or false).

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Lets check if you have a palindrome! Enter a word or phrase: ");

        String userInput = myScanner.nextLine();

        System.out.println(userInput.length());
        String noSpaceEntry = userInput.replaceAll("\\s", "");
        System.out.println(noSpaceEntry);

        //even cases (index is odd)
        if (noSpaceEntry.length() % 2 == 0) {
            int halfLength = noSpaceEntry.length() / 2;
            boolean[] totalResult = new boolean[halfLength];

            for (int i = 0; i < halfLength; i++) {
                char beginning = noSpaceEntry.charAt(i);
                char end = noSpaceEntry.charAt(noSpaceEntry.length() - i - 1);
                boolean result = beginning == end;
                totalResult[i] = result;
                if (!totalResult[i]) {
                    System.out.println("not pali");
                    break;
                }
            }
            System.out.println("yes pali");



//            for(boolean b: totalResult) {
//                if(!b) {
//                    System.out.println("Not a palindrome");
//                    break;
//                }
//                else {
//                    System.out.println("It's a palindrome");
//                }
        } else {
            int halfLength2 = (noSpaceEntry.length() +1)/ 2;

            boolean[] totalResult2 = new boolean[halfLength2];

            for (int i = 0; i < halfLength2; i++) {
                char beginning2 = noSpaceEntry.charAt(i);
                char end2 = noSpaceEntry.charAt(noSpaceEntry.length() - i - 1);
                boolean result2 = beginning2 == end2;
                totalResult2[i] = result2;
                if (!totalResult2[i]) {
                    System.out.println("not pali");
                    break;
                }
                System.out.println("yes pali2");

            }
        }

        }


    }






