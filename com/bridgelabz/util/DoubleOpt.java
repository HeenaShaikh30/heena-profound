/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/DoubleOpt.java
*Execution:   java -cp bin com.bridgelabz.util.DoubleOpt 
*purpose:   Program to perform arithmatic operation on double.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;
 
     class DoubleOpt {
	static double input1;
	static double input2;
	static double input3;

       public static void main(String[] args) {

   	  input1=Double.parseDouble(args[0]);
   	  input2=Double.parseDouble(args[1]);
   	  input3=Double.parseDouble(args[2]); 
 
          double result1 = (input1 + input2 * input3);

          double result2 = (input1 * input2 + input3);

          double result3 = (input1 % input2 + input3);
 
          System.out.println("result of" +input1+ "+" +input2+ "*" +input3+ "=" +result1);

          System.out.println("result of" +input1+ "*" +input2+ "+" +input3+ "=" +result2);
   
          System.out.println("result of"+input1+"%"+input2+"+"+input3+"="+result3);     
  
    }
  }


    


    
    

