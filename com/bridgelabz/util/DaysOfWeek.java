/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/DaysOfWeek.java
*Execution:   java -cp bin com.bridgelabz.util.DaysOfWeek 
*purpose:   Performs operation to calculate DaysOfWeek.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

 class DaysOfWeek {
	static int day;
	static int month;
	static int year;
 
 public static void main(String[] args) {
        
       day = Integer.parseInt(args[0]);
       month = Integer.parseInt(args[1]);
       year = Integer.parseInt(args[2]);
  
  System.out.println("the entered day is" +day+ " month is " +month+ " and year is" +year);

      int y = year-(14-month)/12;
      int x = y+(y/4)-(y/100)+(y/400);
      int m = month+12*((14-month)/12)-2;
      int d = (day+x+(31*m)/12)%7;
      System.out.println("day is " +d);
 }
}

    
    

