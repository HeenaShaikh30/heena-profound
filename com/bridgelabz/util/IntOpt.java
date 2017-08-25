/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/IntOpt.java
*Execution:   java -cp bin com.bridgelabz.util.IntOpt 
*purpose:   Program to perform arithmatic operation on Integer.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

class IntOpt {
	static int input1;
	static int input2;
	static int input3;

     public static void main(String[] args) {

	   input1=Integer.parseInt(args[0]);
        input2=Integer.parseInt(args[1]);
        input3=Integer.parseInt(args[2]);

        double result1 = (input1 + input2 * input3);

        double result2 = (input1 * input2 + input3);

        double result3 = (input1 % input2 + input3); 


        System.out.println("result of" +input1+ "+" +input2+ "*" +input3+ "=" +result1);

        System.out.println("result of" +input1+ "*" +input2+ "+" +input3+ "=" +result2);
   
        System.out.println("result of"+input1+"%"+input2+"+"+input3+"="+result3);     
  
    }
  }
    


    
    

