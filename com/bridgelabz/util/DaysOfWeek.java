/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/DaysOfWeek.java
*Execution:   java -cp bin com.bridgelabz.util.DaysOfWeek 
*purpose:   Performs operation to calculate DaysOfWeek.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
class DaysOfWeek {
 
/*Declaration of main*/
    public static void main(String[] args) {
        
/*parse is a method which takes a string(input) as an argument and convert it in integer.
 day,month,year are variables which stores the number enterd by the user as input*/
  int day = Integer.parseInt(args[0]);
  int month = Integer.parseInt(args[1]);
  int year = Integer.parseInt(args[2]);
  
    System.out.println("the entered day is" +day+ " month is " +month+ " and year is" +year);


  /*performs the following operstions to calculate day*/
      int y = year-(14-month)/12;
      int x = y+(y/4)-(y/100)+(y/400);
      int m = month+12*((14-month)/12)-2;
      int d = (day+x+(31*m)/12)%7;

/*prints the output*/
   System.out.println("day is " +d);
 }
}

    
    

