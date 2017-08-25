/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/SpringSeason.java
*Execution:   java -cp bin com.bridgelabz.util.SpringSeason
*purpose:   program to find spring seasons.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

public class SpringSeason{
static int month,year;
  
   public static void main(String args[]) {

      month=Integer.parseInt(args[0]);
      day=Integer.parseInt(args[1]);

      boolean isSpring=(month==3 && day>=20 && day<=31)
                    || (month==4 && day>=1 && day<=30)
                    || (month==5 && day>=1 && day<=31)
                    || (month==6 && day>=1 && day<=20);

      System.out.println(isSpring);
 }
}
