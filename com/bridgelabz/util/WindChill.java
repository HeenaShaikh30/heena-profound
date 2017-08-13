/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/WindChill.java
*Execution:   java -cp bin com.bridgelabz.util.WindChill 
*purpose:   Program for windchild.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/

public class WindChill {

/*Declaration of main*/
    public static void main(String[] args) {
        
/*passing command line arguments as a input*/
  int temp=Integer.parseInt(args[0]);
  int velocity=Integer.parseInt(args[1]);

/*prints the result*/
    System.out.println("the entered value of temperature is " +temp+ " and velocity is " +velocity);

      double result = 35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(velocity,0.16);

   System.out.println("value of wind chill is" +result);
 }
}

    
    

