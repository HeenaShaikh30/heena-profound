/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/ReapetedNumber.java
*Execution:   java -cp bin com.bridgelabz.util.ReapetedNumber
*purpose:   Program for finding repated numbers.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

public class ReapetedNumber 
{   
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,2,6,5,8};
 
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
