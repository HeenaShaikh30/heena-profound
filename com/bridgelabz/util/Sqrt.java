/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Sqrt.java
*Execution:   java -cp bin com.bridgelabz.util.Sqrt 
*purpose:   Program to compute the square root of nonnegative number.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

  public class Sqrt { 

    	staic double c,epsilon,t;
 
  public static void main(String[] args) { 

      c = Double.parseDouble(args[0]);
        
	   epsilon = 1e-15;    
        
 	   t = c;                     
 	   while (Math.abs(t - c/t) > epsilon*t) {
            
	   t = (c/t + t) / 2.0;
        }

      System.out.println(t);
    
  }


}

