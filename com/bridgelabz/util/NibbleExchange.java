/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/NibbleExchange.java
*Execution:   java -cp bin com.bridgelabz.util.NibbleExchange 
*purpose:   Program for generating an error.
*@author:  Heena Shaikh
*@version:1.0
*@since:15-8-2017
***************************************************************/ 
package com.bridgelabz.util;

public class NibbleExchange {
	
	static int decimalNumber,temp,reminder;
	
	public static void main(String args[]){
		int decimalNumber=Integer.parseInt(args[0]);
		int digits[]=new int[8];
		temp=decimalNumber;
		for(int i=0;temp!=0;i++)
		{
			reminder=temp%2;
			temp=temp/2;
			digits[i]=reminder;
		}
		System.out.println("Binary Equivalent of "+decimalNumber+" is ");
		for(int i=7;i>=0;i--)
		{
			System.out.print(digits[i]);
		}	
		System.out.println("\nBinary Equivalent of "+decimalNumber+" after nibble exchange is ");
		for(int i=7,j=3;i>=4;i--,j--)
		{
			int tempDigit=digits[i];
			digits[i]=digits[j];
			digits[j]=tempDigit;
		}
		int decimalNumberAfterExchange=0;
		for(int i=7;i>=0;i--)
		{
			decimalNumberAfterExchange=decimalNumberAfterExchange+digits[i]*(int)Math.pow(2,i);
			System.out.print(digits[i]);
		}	
		System.out.println("\nDecimal Equivalent after nibble exchange : "+decimalNumberAfterExchange);
	}
}