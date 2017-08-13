/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/SumOf2Dise.java
*Execution:   java -cp bin com.bridgelabz.util.SumOf2Dise 
*purpose:   Program to perform sum of2 dise.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
   public class SumOf2Dise{

/*Declaration of Main*/
      public static void main(String[] args){

/*command line argument*/  
        int Input1=Integer.parseInt(args[0]);
        int Input2=Integer.parseInt(args[1]);

   System.out.println("No enterd by first dise"+Input1+"&secnod dise is"+Input2);

/*Intialization of for loop*/
     for(int fact1=1;fact1<Input1;fact1++){

        for(int fact2=1;fact2<Input2;fact2++){

          double res1=Math.random()*6+1;
          double res2=Math.random()*6+1;


   System.out.println("result1 is" +res1+ "& result2 is" +res2);

   double sum= res1 + res2;
/*prints the result*/
   System.out.println("sum of two dice is" +sum);
   }
  }
 }
}





