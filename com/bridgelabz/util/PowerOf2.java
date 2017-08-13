/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/PowerOf2.java
*Execution:   java -cp bin com.bridgelabz.util.PowerOf2
*purpose:   Program to calculate power of 2.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class PowerOf2 {

/*Declaration of Main*/
  public static void main(String args[]){


/*parse is a method which takes a string(input) as an argument and convert in double.
 inputNo are variables which stores the number enterd by the user as input*/ 
    int inputNo=Integer.parseInt(args[0]);
    
/* inputNo>31 will overflow an int */

       if(inputNo>=0 && inputNo<31)
          {

      for(int i=0;i<=inputNo;i++)
         {
          
/*prints the result*/        
     System.out.println("the table is " +i+ " " +Math.pow(2,i));
             
}

  }
}
}