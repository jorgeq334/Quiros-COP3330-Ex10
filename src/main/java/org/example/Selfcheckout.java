package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Selfcheckout
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double priceItem1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int quantityItem1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        double priceItem2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int quantityItem2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        double priceItem3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int quantityItem3 = input.nextInt();
        double subTotal = (priceItem1*quantityItem1)+(priceItem2*quantityItem2)+(priceItem3*quantityItem3);
        double tax= (subTotal*5.5)/100;
        double total = subTotal + tax;
        System.out.println("Subtotal is: $" + subTotal);
        System.out.println("Tax is: $" + tax);
        System.out.println("Total is: $" + total);

    }
}
