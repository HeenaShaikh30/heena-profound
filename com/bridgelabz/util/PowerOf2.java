/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/PowerOf2.java
*Execution:   java -cp bin com.bridgelabz.util.PowerOf2
*purpose:   Program to calculate power of 2.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

public class PowerOf2 {
static int inputNo;

  public static void main(String args[]){
	inputNo=Integer.parseInt(args[0]);
    
	if(inputNo>=0 && inputNo<31)
          {

        for(int i=0;i<=inputNo;i++)
         {
                  
        System.out.println("the table is " +i+ " " +Math.pow(2,i));
             
}

  }
}
