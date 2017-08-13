/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Quadratic_Equation.java
*Execution:   java -cp bin com.bridgelabz.util.Quadratic_Equation 
*purpose:   Program to calculate Quadratic_Equation.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*Import Declaration*/
import java.util.Scanner;

/*class Declaration*/
public class Quadratic_Equation {

/*Declaration of  main*/
    public static void main(String[] args) {

/*parse is a method which takes a string(input) as an argument and convert in double.
 minput1,minput2,minput3 are variables which stores the number enterd by the user as input*/ 
     int mInput1,mInput2,mInput3;
   double root1,root2,d;
/*Takes an input*/
    Scanner scan=new Scanner(System.in);
   
    System.out.println("enter input1");
     mInput1=scan.nextInt();

     System.out.println("enter input2");
      mInput2=scan.nextInt();

      System.out.println("enter input3");
       mInput3=scan.nextInt();

/*Calculate the quadratic equation*/
     System.out.println("given quadratic equation is" +mInput1+"x^2+"+mInput2+"x+"+mInput3);
   d=mInput2*mInput2-4*mInput1*mInput3;
     if(d>0)
{

   System.out.println("Roots are real and unequal");
 root1=(-mInput2+Math.sqrt(d))/(2*mInput1);
 root2=(-mInput2-Math.sqrt(d))/(2*mInput1);
System.out.println("first root is"+root1);
System.out.println("second root is"+root2);

}

else if(d==0)
{
System.out.println("Roots are real and equal");
root1=(-mInput2+Math.sqrt(d))/(2*mInput1);
System.out.println("root is"+root1);
}
else
{
System.out.println("roots are imaginary");
}
}
}



    
    

