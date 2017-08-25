/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/UseArgument.java
*Execution:   java -cp bin com.bridgelabz.util.UseArgument 
*purpose:   Program for using argument.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

public class UseArgument {

 public static void main(String[] args) {
        
    System.out.print("Hi, ");
        
	System.out.print(args[0]);
        
	System.out.println(". How are you?");
   
 }


}
