/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        float euros;
        float rate;

        System.out.println("How many euros are you exchanging? ");
        euros= Float.parseFloat(scanner.nextLine());

        System.out.println("What is the exchange rate?");
        rate = Float.parseFloat(scanner.nextLine());

        app.displayResults(euros,rate);
    }

    private void displayResults(float euros, float rate) {
        System.out.printf("%.2f euros at an exchange rate of %.4f is\n%.2f U.S dollars",euros,rate,euros*rate);
    }
}
