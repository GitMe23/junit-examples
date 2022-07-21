package com.ah;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {

        StringHelper stringHelper = new StringHelper();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string and the program will return the first two letters if they are 'A': ");
        System.out.print("Output: " + stringHelper.truncateAinFirstTwoLetters(scanner.nextLine()));
    }
}
