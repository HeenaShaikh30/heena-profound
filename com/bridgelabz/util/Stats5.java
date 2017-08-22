/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Stats5.java
*Execution:   java -cp bin com.bridgelabz.util.Stats5 
*purpose:   Program for converting into binary number.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/

package com.bridgelabz.util;

public class Stats5{
	
	public static void main(String args[]){
		double array[]=new double[5];
		double sum=0;
		for (int i = 0; i < 5; i++) 
		{
            array[i]=Math.random();
			System.out.println(array[i]);
        }
		for (int i = 0; i < 5; i++) 
		{
            sum=sum+array[i];
        }
		double average=sum/5;
		System.out.println("Average is "+average);
		double maximum=array[0];
		for (int i = 0; i < 5; i++) 
		{
            maximum=Math.max(maximum,array[i]);
        }
		System.out.println("Maximum no is "+maximum);
		double minimum=array[0];
		for (int i = 0; i < 5; i++) 
		{
            minimum=Math.min(minimum,array[i]);
        }
		System.out.println("Maximum no is "+minimum);
	}
}