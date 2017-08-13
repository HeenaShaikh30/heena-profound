/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/RandomSeq.java
*Execution:   java -cp bin com.bridgelabz.util.RandomSeq 
*purpose:   Program to display random function.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class RandomSeq {

/*Declaration of main*/
  public static void main(String args[]){

/*parse is a method which takes a string(input) as an argument and convert in double.
 inputNo variable which stores the number enterd by the user as input*/ 

    int inputNo=Integer.parseInt(args[0]);

      for(int i=0;i<=inputNo;i++)
       
        {
           System.out.println(Math.random());
             
}

  }
}