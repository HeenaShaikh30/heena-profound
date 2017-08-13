/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/TemperatureConversion.java
*Execution:   java -cp bin com.bridgelabz.util.TemperatureConversion 
*purpose:   Performs operation to calculate payment.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*Import Declaration*/
import java.util.Scanner;

/*class Declaration*/
public class TemperatureConversion {

/*Declaration of main*/
    public static void main(String[] args) {
       
Scanner scan=new Scanner(System.in);

/*passing argument as input*/
  int tempCel= Integer.parseInt(args[0]);
  int tempFar= Integer.parseInt(args[1]);
  
   System.out.println();
   System.out.println("the entered value of celsius is " +tempCel+ " and fahrenhite is " +tempFar);
   System.out.println();    

/*Displaying menu*/ 
   System.out.println("MENU:");
   System.out.println("1. Celcius to Fahrenhite");  
   System.out.println("2. Fahrenhite to Celcius");
    System.out.println();

     System.out.println("enter your choice");
     int Result=scan.nextInt();

      System.out.println("the entered choice is " +Result);

/*Declaration of switch*/
    switch(Result)
   {
     case 1: int ResultFar = (tempCel*9/5)+32;
            System.out.println(" The" +tempCel+" in celcius is converted to " +ResultFar+ "in Fahrenhite");
            break;

     case 2: int ResultCel =(tempFar-32)*5/9;
            System.out.println(" The" +tempFar+ "in Fahrenhite is converted to " +ResultCel+ "in Celcius");
            break;
     
     default: System.out.println("invalid entry");
  }
 }
}

     
    
    
    

