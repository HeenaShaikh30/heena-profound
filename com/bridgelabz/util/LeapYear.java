/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/LeapYear.java
*Execution:   java -cp bin com.bridgelabz.util.LeapYear 
*purpose:   Program for finding an leap year.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

public class LeapYear{
static int year;

	public static void main(String args[]){

  	int year=Integer.parseInt(args[0]);

        boolean isLeapYear;

    isLeapYear=(year % 4 == 0);

  	isLeapYear=isLeapYear && (year % 4 != 0);

   	isLeapYear =isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
      }

   }
