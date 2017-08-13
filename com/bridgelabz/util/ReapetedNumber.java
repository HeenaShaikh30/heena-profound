/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/ReapetedNumber.java
*Execution:   java -cp bin com.bridgelabz.util.ReapetedNumber
*purpose:   Program for finding repated numbers.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class ReapetedNumber 
{   
/*Declaration of main*/
    public static void main(String[] args) 
    {
/*Array Declaration*/
        int[] arr = {1,2,3,4,5,2,6,5,8};
 
/*Initialization of loop*/
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if( (arr[i]==(arr[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+arr[j]);
                }
            }
        }
    }    
}