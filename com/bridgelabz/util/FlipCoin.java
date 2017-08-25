/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/FlipCoin.java
*Execution:   java -cp bin com.bridgelabz.util.FlipCoin 
*purpose:   program to simulate a coin flip and print out heads or tails percentage.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

public class FlipCoin
{
	static int flipTimes,headTimes=0,tailTimes=0,counter,total,headpercent,tailpercent;
	

	public static void main(String args[])
	{
		flipTimes=Integer.parseInt(args[0]);
	        System.out.println("How many times you want to flip a coin?"+flipTimes);
		 for(counter=1;counter<=flipTimes;counter++){

		   	if(Math.random() < 0.5){
                        System.out.println("Heads");
                        headTimes++;}

		  else{

		     System.out.println("Tails");
		     tailTimes++;}

		  }total++;
			System.out.println("number of times head apperad is"+headTimes+"and tail appeared is"+tailTimes);
			headpercent=(headTimes*100)/total;
			tailpercent=(tailTimes*100)/total;

			System.out.println("percentage of heads is"+headpercent+"and percentage of tails is"+tailpercent);
 }
}
