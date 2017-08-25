/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Trig.java
*Execution:   java -cp bin com.bridgelabz.util.Trig 
*purpose:   Program to find triangle.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

  class Trig{
  static double degree,radian;

  public static void main(String args[]){

    degree=Double.parseDouble(args[0]);
    radian=Double.parseDouble(args[1]);

   double s=Math.sin(radian);
   System.out.println("sin("+degree+")="+s);

   double c=Math.cos(radian);
   System.out.println("cos("+degree+")="+c);

   double t=Math.tan(radian);
   System.out.println("tan("+degree+")="+t);

   double r=s*s+c*c;
   System.out.println(s*s+"+"+c*c+"="+r);
  }
 }
