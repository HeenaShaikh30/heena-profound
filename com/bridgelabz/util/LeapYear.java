/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/LeapYear.java
*Execution:   java -cp bin com.bridgelabz.util.LeapYear 
*purpose:   Program for finding an leap year.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class LeapYear{

/*Declaration of Main*/
  public static void main(String args[]){


/*parse is a method which takes a string(input) as an argument and convert in double.
 year  is variable which stores the number enterd by the user as input*/
  int year=Integer.parseInt(args[0]);

   boolean isLeapYear;

  /*divisible by 4*/
  isLeapYear=(year % 4 == 0);

   /*divisible by 4 and not 100*/
  isLeapYear=isLeapYear && (year % 4 != 0);

   /*divisible by 4 and not 100 unless divisible by 400*/
  isLeapYear =isLeapYear || (year % 400 == 0);

  /*prints the result*/
    System.out.println(isLeapYear);
      }

   }