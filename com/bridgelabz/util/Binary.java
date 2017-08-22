/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Binary.java
*Execution:   java -cp bin com.bridgelabz.util.Binary 
*purpose:   Program for converting into binary number.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

  public class Binary{

  static int Number;
  public static void main(String[] args){
  Number=Integer.parseInt(args[0]);

   int power=1;
   while(power<=Number/2){
   power*=2;
   }

   while(power>0){
   if(Number<power){
   System.out.print(0);
   }

   else{
   System.out.print(1);
   Number-=power;
   }
    power/=2;
   }
    System.out.println();
  }
}
