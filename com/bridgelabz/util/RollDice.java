/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/RollDice.java
*Execution:   java -cp bin com.bridgelabz.util.RollDice 
*purpose:   Program for generating random number between 1nto 6.
*@author:  Heena Shaikh
*@version:1.0
*@since:15-8-2017
***************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

public class RollDice
{
	public static void main(String args[])
	{
		Scanner Scanner=new Scanner(System.in);
		int[] counter={0,0,0,0,0,0,0};
		System.out.println("Press 0 for Roll a dice");
		int roll=Scanner.nextInt();
		while(roll==0)
		{
			double dice1=Math.random()*6+1;
			int dice=(int) dice1;
			System.out.println("Rolled no is "+dice);
			switch(dice)
			{
				case 1:counter[1]++;
						break;
				case 2:counter[2]++;
						break;
				case 3:counter[3]++;
						break;
				case 4:counter[4]++;
						break;
				case 5:counter[5]++;
						break;
				case 6:counter[6]++;
						break;
				default :System.out.println("Something went wrong");
							break;
			}
			counter[0]++;
			System.out.println("If want to roll dice again then Press 0");
			roll=Scanner.nextInt();
		}
		int times=counter[1];
		int number=1;
		for(int i=1;i<7;i++)
		{
			if(times<counter[i])
			{
				number=i;
				times=counter[i];
			}	
		}
		System.out.println(number+" is repeated "+times+" times out of "+counter[0]);
	}
}		