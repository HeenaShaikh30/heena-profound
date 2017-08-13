/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/SecondLargest_Smallest.java
*Execution:   java -cp bin com.bridgelabz.util.SecondLargest_Smallest
*purpose:   Program to find second largest and second smallest numbers.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*Import Declaration*/
import java.util.Scanner;

/*class Declaration*/
public class SecondLargest_Smallest
{

/*Declarion of main*/
    public static void main(String[] args) 
    {
/*Varible Declaration*/
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
/*Array Declaration*/

        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
/*Prints the result*/
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Second Smallest:"+a[1]);
    }
}