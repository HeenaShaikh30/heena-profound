/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Distance.java
*Execution:   java -cp bin com.bridgelabz.util.Distance 
*purpose:   Performs operation to calculate Distance.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

  public class Distance {
	static int Input1;
	static int Input2;

  public static void main(String[] args) {
      
	Input1=Integer.parseInt(args[0]);
 	Input2=Integer.parseInt(args[1]);

  double dist=Math.sqrt(Input1*Input1 + Input2*Input2);

  System.out.println("Distance from(" +Input1+ "," +Input2+ ") to (0,0)=" +dist);

   }

}


    

