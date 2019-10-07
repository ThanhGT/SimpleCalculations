/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2exercise;

import java.util.Scanner;

/**
 * Class 2-3 Exercise Problem 3
 * Calculate the circumference and area of a circle
 * Author: Thanh Tran
 * Date: September 12, 2018
 */
public class CircAreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    // declarations and initializations
    final double PI = 3.14159;
    double area;    // declares the variable area
    double circum;   // declares the variable circum
    
    // displays the value of the variables to the user
    System.out.println ("PI: " + PI);
    
    Scanner input = new Scanner(System.in);
    System.out.println ("Please enter a value for the radius");
    double radius = input.nextDouble();
    
    circum = 2*PI*radius;   // compute the circumference of a circle
    area = PI*radius*radius;   // compute the area of a circle
    
    // displays the output to the user
    System.out.println ("\nThe radius of a circle is " + radius);
    System.out.println ("The area of a circle is " + area);
    System.out.println ("The circumference of a circle is " + circum);
   
    }   
}
