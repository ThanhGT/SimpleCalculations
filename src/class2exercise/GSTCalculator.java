package Class2exercise;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 * Class 2-3 Exercise Problem 3
 * Calculating GST on a sold ticket
 * Author: Thanh Tran
 * Date: September 17, 2018
 */

public class GSTCalculator {

    public static void main (String[] args)    {
    
    final double GST= 0.13; // declares and intitialize constant
    double ticketPrice; // declares ticketPrice
    double salePrice = 0; // declares salePrice
    
    Scanner input = new Scanner (System.in);
    // ask the user to enter ticket price
    System.out.println ("Please enter a value for the ticketed price:" );
    ticketPrice = input.nextDouble();
    
    // computer sales tax
    double tax = ticketPrice * GST;
    
    //compute sales price
    salePrice = ticketPrice + tax;
    
    // displays output
    System.out.println ("ticketPrice:" + ticketPrice);
    System.out.println ("GST:" + tax);
    System.out.println ("The sale price of this ticket is:" + salePrice);
    
    
    
    
    }
}
