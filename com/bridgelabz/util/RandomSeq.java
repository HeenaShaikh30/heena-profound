/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/RandomSeq.java
*Execution:   java -cp bin com.bridgelabz.util.RandomSeq 
*purpose:   Program to display random function.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

public class RandomSeq {
staic int inputNo;
public static void main(String args[]){
 
	inputNo=Integer.parseInt(args[0]);
	for(int i=0;i<=inputNo;i++) 
{
        System.out.println(Math.random());
             
  }
 }
}
