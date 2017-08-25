/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/PrintThreeNames.java
*Execution:   java -cp bin com.bridgelabz.util.PrintThreeNames 
*purpose:   Program to perform arithmatic operation on double.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

class PrintThreeNames{

  	public static void main(String args[]){

   	Scanner scan=new Scanner(System.in);

        System.out.println("enter three names");
     
        	  String mName1 = scan.next(); 
          	String mName2 = scan.next();
          	String mName3 = scan.next();
     

       		 System.out.println(" hi " +mName3);
  
      		 System.out.println(" hi " +mName2);
           
       		 System.out.println(" hi " +mName1);
  }
 }


