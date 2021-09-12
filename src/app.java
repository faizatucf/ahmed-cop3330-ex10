/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class self {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int item1,item2,item3;
        double price1,price2,price3,subtotal,total,tax;
        System.out.println("Enter the price of item 1:");
        price1 = sc.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        item1 = sc.nextInt();
        System.out.println("Enter the price of item 2:");
        price2 = sc.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        item2 = sc.nextInt();
        System.out.println("Enter the price of item 3:");
        price3 = sc.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        item3 = sc.nextInt();
        subtotal = (price1*(float)item1) + (price2*(float)item2) + (price3*(float)item3);
        tax = (0.055)*subtotal;
        total = (tax) + subtotal;
        System.out.println(String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal,tax,total));
    }
}