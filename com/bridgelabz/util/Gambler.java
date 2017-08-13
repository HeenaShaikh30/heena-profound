/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Gambler.java
*Execution:   java -cp bin com.bridgelabz.util.Gambler
*purpose:  Program for gambler.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class Gambler {
 

    public static void main(String[] args) {
 
       int stake  = Integer.parseInt(args[0]);
 /* gambler's stating bankroll
*/
       int goal   = Integer.parseInt(args[1]);
 /*gambler's desired bankroll*/

        int trials = Integer.parseInt(args[2]);
/*number of trials to perform

*/
 /*total number of bets made*/

int bets = 0; 
                
/*total number of games won

*/
int wins = 0;       
// repeat trials times
 
       for (int t = 0; t < trials; t++) {

  
          // do one gambler's ruin simulation
 
           int cash = stake;
  
          while (cash > 0 && cash < goal) {

                bets++;
             
   if (Math.random() < 0.5)
 cash++;    
 // win $1
   
    else    
   cash--;  
   // lose $1
 
  }
           
 if (cash == goal) 
wins++;                
// did gambler go achieve desired goal?
        
}

        
// print results
        
System.out.println(wins + " wins of " + trials);
       
 System.out.println("Percent of games won = " + 100.0 * wins / trials);
        
System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}

