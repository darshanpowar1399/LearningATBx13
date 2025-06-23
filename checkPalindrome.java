package ex_01_Java_Basics;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class checkPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value");
        String input = scanner.nextLine();
        System.out.println(input);
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
        if (input.equals(reversed)) {
            System.out.println("Input is Palindrome");
            return;
        }
        System.out.println("Input is not a palindrome");
    }
}