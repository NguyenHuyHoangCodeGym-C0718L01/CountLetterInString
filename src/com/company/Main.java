package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = scanner.nextLine();

        System.out.println("The number of letters in string is: "+countLetters(s));
    }

    public static int countLetters(String s){
        char[] temp = s.toCharArray();

        return temp.length;
    }
}
