/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderAmount = in.nextDouble();
        in.nextLine();
        System.out.print("What state do you live in? ");
        String state = in.nextLine().toLowerCase();
        System.out.print("What county do you live? ");
        String county = in.nextLine().toLowerCase();

        double taxPercent = 0;
        if (state.equals("wisconsin")) {
            taxPercent += 0.05;
            if (county.equals("eau claire"))
                taxPercent += 0.005;
            else if (county.equals("dunn"))
                taxPercent += 0.004;
        } else if (state.equals("illinois")) {
            taxPercent += 0.08;
        }

        double tax = orderAmount * taxPercent;
        double total = orderAmount + tax;

        System.out.printf("The tax is $%.2f.\n", tax);
        System.out.printf("The total is $%.2f.\n", total);
    }
}
