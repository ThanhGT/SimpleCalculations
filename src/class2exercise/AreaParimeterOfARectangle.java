/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2exercise;

/**
 * Class 2-3 Exercise Problem 2
 * Parimeter and area of a rectangle
 * Author: Thanh Tran
 * Date: September 12, 2018
 */

public class AreaParimeterOfARectangle {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
  
    // declarations and initializations
    double width = 4.5; // represents the width of the rectangle
    double height = 6.7;    // represents the height the rectangle
    double area;    // declares the variable area
    double parim;   // declares the variable parim
    
    // displays the value of the variables to the user
    System.out.println ("Width: " + width);
    System.out.println ("Height: " + height);
    
    area = width * height;  // compute the area of the rectangle
    parim = 2 * (width + height);   // compute the parimeter of the rectangle
    
    // displays the output to the user
    System.out.println ("\nThe area of a circle is " + area);
    System.out.println ("The parimeter of a circle is " + parim);
    
    }   
}
