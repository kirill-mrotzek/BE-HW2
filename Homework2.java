package com.telran.org.Homework;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first word :");
        String firstWord = scanner.nextLine();
        System.out.println("Please enter the second word :");
        String secondWord = scanner.nextLine();


        if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
        String firstHalf = firstWord.substring(0, firstWord.length() / 2);
        String secondHalf = secondWord.substring(secondWord.length() / 2, secondWord.length());
        System.out.println(firstHalf + secondHalf);
        }
        scanner.close();
        String str = "I study Basic Java!";
        processString(str);
    }

    public static void processString(String str) {
    char lastChar = str.charAt(str.length() - 1);
        System.out.println("The last char is " + lastChar);

        boolean contains = str.contains("Java");
        System.out.println("The String contains Java " + contains);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String partOfString = str.substring(13, str.length() - 1);
        System.out.println(partOfString);

    }

}
