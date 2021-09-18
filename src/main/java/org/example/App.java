/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;
public class App{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n;
        String res;

        System.out.print("What is your name? ");
        n = s.nextLine();
        res = "Hello, ".concat(n).concat(", nice to meet you!");
        System.out.print(res);

    }
}