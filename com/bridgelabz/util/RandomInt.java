/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/RandomInt.java
*Execution:   java -cp bin com.bridgelabz.util.RandomInt 
*purpose:   Progrwm for RandomInt.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/


public class RandomInt {
 
    public static void main(String[] args) { 
        
// a positive integer
        
int n = Integer.parseInt(args[0]);

        
// a pseudo-random real between 0.0 and 1.0
        
double r = Math.random(); 

        
// a pseudo-random integer between 0 and n-1
        
int value = (int) (r * n);

        
System.out.println(value);
    }
}
