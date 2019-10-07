/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class2exercise;

import java.util.Scanner;

/**
 * Class 2-3 Exercise Problem 3
 * Calculation the acceleration of a project
 * Author: Thanh Tran
 * Date: September 17, 2018
 */

public class AccelerationCalculation {
    
    public static void main (String[] args) {
        
        // declaration of variables
        double V0;  // declare starting velocity  
        double V1; // declare ending velocity
        double t;   // declare time
        
        // read inputs from the user
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter a value for the starting velocity");
        V0 = input.nextDouble();
        
        System.out.println ("Please enter a value for the ending velocity");
        V1 = input.nextDouble();
        
        System.out.println ("Please enter a value for the time span");
        t = input.nextDouble();
        
        double accel = (V1 - V0) / t;   // compute the acceleration
        
        // display the output to the user
        System.out.println ("The average accelearation is: " + accel);
    }
    
}
