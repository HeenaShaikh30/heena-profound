/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Distance.java
*Execution:   java -cp bin com.bridgelabz.util.Distance 
*purpose:   Performs operation to calculate Distance.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class Distance {

/*Declaration of main*/ 
   public static void main(String[] args) {
      

/*parse is a method which takes a string(input) as an argument and convert it in integer.
 input1,input2 are variables which stores the number enterd by the user as input*/
 int input1=Integer.parseInt(args[0]);
 int input2=Integer.parseInt(args[1]);

 /*performs the following operstions to calculate distance*/
   double dist=Math.sqrt(input1*input1 + input2*input2);

/*prints the output*/
    System.out.println("Distance from(" +input1+ "," +input2+ ") to (0,0)=" +dist);

}

  }


    

