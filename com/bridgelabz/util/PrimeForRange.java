/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/PrimeForRange.java
*Execution:   java -cp bin com.bridgelabz.util.PrimeForRange
*purpose:   Program for primechecker.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************
package com.bridgelabz.util;

class PrimeForRange{
int flag=0,ctr1,ctr2;

       public static void main(String args[]){
       int sp=Integer.parseInt(args[0]);
       int ep=Integer.parseInt(args[1]);

       System.out.println("The entered start point"+sp+"& end point is"+ep );

       for(ctr1=sp;ctr1<ep;ctr1++){

       for(ctr2=2;ctr2<ctr1;ctr2++){

       if(ctr1%ctr2==0){
       flag=0;
       break;
       }
       else{
       flag=1;
   }
}
       if(flag==1){

      System.out.println(ctr1);
   }
  }
 }
}
