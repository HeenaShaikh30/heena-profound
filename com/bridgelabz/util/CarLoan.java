/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/CarLoan.java
*Execution:   java -cp bin com.bridgelabz.util.Carloan 
*purpose:   Performs operation to calculate payment.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
 class CarLoan {

/*Declaration of main*/
    public static void main(String[] args) {

/*parse is a method which takes a string(input) as an argument and convert in double.
 priciple,rate,year are variables which stores the number enterd by the user as input*/ 
              
  double principal=Double.parseDouble(args[0]);
  double rate=Double.parseDouble(args[1]);
  double year=Double.parseDouble(args[2]);
  
    System.out.println("the entered principal is" +principal+ " rate is " +rate+ "and year is "+year);

  /*performs the following operstions to calculate payment*/  
     double n=12*rate;
     double r=rate/(12*100);
     double payment=(principal*r)/(1-Math.pow(1+r,(-n)));
/*prints the output*/

   System.out.println("payment is"+payment);
 }
}

    
    


   
    

