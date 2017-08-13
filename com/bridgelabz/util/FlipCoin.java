/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/FlipCoin.java
*Execution:   java -cp bin com.bridgelabz.util.FlipCoin 
*purpose:   program to simulate a coin flip and print out heads or tails percentage.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
class FlipCoin{

/*Declaration of Main*/
  public static void main(String args[]){

/* Math.random() returns a value between 0.0 and 1.0 */
/* so it is head or tails 50% of the time */

   if(Math.random() < 0.5)

     System.out.println("Heads");

  else

     System.out.println("Tails");

  }
 }