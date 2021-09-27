/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("What is the password? ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if(password.equals("abc$123"))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

        scanner.close();
    }
}