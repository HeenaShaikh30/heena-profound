/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/CarLoan.java
*Execution:   java -cp bin com.bridgelabz.util.Carloan 
*purpose:   Performs operation to calculate payment.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

 class CarLoan {
 static double principal;
 static double rate;
 static double year;

 public static void main(String[] args) {
 
    principal=Double.parseDouble(args[0]);
    rate=Double.parseDouble(args[1]);
    year=Double.parseDouble(args[2]);
  
    System.out.println("the entered principal is" +principal+ " rate is " +rate+ "and year is "+year);
 
     double n=12*rate;
     double r=rate/(12*100);
     double payment=(principal*r)/(1-Math.pow(1+r,(-n)));

     System.out.println("payment is"+payment);
 }
}



    
    


   
    

