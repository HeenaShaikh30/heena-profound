/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Sqrt.java
*Execution:   java -cp bin com.bridgelabz.util.Sqrt 
*purpose:   Program to compute the square root of nonnegative number.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/


public class Sqrt { 
    
public static void main(String[] args) { 

        
// read in the command-line argument
        
double c = Double.parseDouble(args[0]);
        
double epsilon = 1e-15;    
// relative error tolerance
        
double t = c;              
// estimate of the square root of c

        
// repeatedly apply Newton update step until desired precision is achieved
       
 while (Math.abs(t - c/t) > epsilon*t) {
            
t = (c/t + t) / 2.0;
        }

       
 // print out the estimate of the square root of c
        
System.out.println(t);
    }

}
