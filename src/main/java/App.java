/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    public static final String Correctpass = "abc$123"; //Implement constant for correct password
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Scanner to obtain input from the user

        System.out.println("What is the password? ");
        String pass = sc.nextLine();    //Read input from user

        //Using if-else statement
        if (pass.equals(Correctpass)) {
            System.out.println("Welcome!"); //display message if user input the correct password
        } else {
            System.out.println("I don't know you.");    //display message if user input the incorrect password
        }
    }
}
