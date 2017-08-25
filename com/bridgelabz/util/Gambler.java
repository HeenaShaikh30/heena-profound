/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Gambler.java
*Execution:   java -cp bin com.bridgelabz.util.Gambler
*purpose:  Program for gambler.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
package com.bridgelabz.util;

   public class Gambler {
   static int stake;
   static int goal;
   static int trials;
    
 

   public static void main(String[] args) {
 
        stake  = Integer.parseInt(args[0]);
        goal   = Integer.parseInt(args[1]);

        trials = Integer.parseInt(args[2]);

        int bets = 0; 
        int wins = 0;       

        for (int t = 0; t < trials; t++) {

  
          
           int cash = stake;
  
             while (cash > 0 && cash < goal) {

                bets++;
             
             if (Math.random() < 0.5)
                  cash++;    
             else    
                  cash--;  
    }
           
             if (cash == goal) 
                   wins++;                
        
}

        
    
	System.out.println(wins + " wins of " + trials);
       
 System.out.println("Percent of games won = " + 100.0 * wins / trials);
        
	System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}

