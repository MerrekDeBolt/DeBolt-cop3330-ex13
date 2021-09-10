package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 13 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        double principal, rate, total;
        int years, compounds;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the principal amount? ");
        input = scanner.nextLine();
        principal = Double.parseDouble(input);

        System.out.println("What is the rate? ");
        input = scanner.nextLine();
        rate = Double.parseDouble(input);
        rate /= 100;

        System.out.println("What is the number of years? ");
        input = scanner.nextLine();
        years = Integer.parseInt(input);

        System.out.println("What is the number of times the interest is compounded per year? ");
        input = scanner.nextLine();
        compounds = Integer.parseInt(input);

        total = principal * Math.pow((1 + (rate / compounds)), compounds * years);

        rate *= 100;
        System.out.println("$" + String.format("%.2f", principal) + " invested at " + String.format("%.2f", rate) + "% for " + years + " years compounded " + compounds + " times per year is $" + String.format("%.2f", total) + ".");
    }
}