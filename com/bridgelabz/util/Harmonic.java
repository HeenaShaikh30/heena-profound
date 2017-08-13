/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Harmonic.java
*Execution:   java -cp bin com.bridgelabz.util.Harmonic 
*purpose:   Program for printing Harmonic numbers.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class Harmonic {
 
/*creating a methid named harmonic*/

public static double Harmonic (int n){
 
/*Initializing sum as 0*/

double sum=0.0;
for(int i=1;i<=n;i++)
{
sum+=1.0/i;
}
return sum;
}

/*Declaration of Main*/
  public static void main(String args[]){

/*parse is a method which takes a string(input) as an argument and convert in double.
 InputNo is variable which stores the number enterd by the user as input*/ 

for(int i=0;i<args.length;i++)
{
/*acceprting the value from user*/
int arg=Integer.parseInt(args[i]);

/*Stores the value of harmonic number*/
double value=Harmonic(arg);

/*prints the sum of harmonic series*/
System.out.println(value);
}
}
}
  
             


  

