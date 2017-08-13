
/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/TenHellos.java
*Execution:   java -cp bin com.bridgelabz.util.TenHellos 
*purpose:   Program for ten hellos.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/

public class TenHellos { 
    
public static void main(String[] args) {

        
// print out special cases whose ordinal doesn't end in th
        
System.out.println("1st Hello");
        
System.out.println("2nd Hello");
       
 System.out.println("3rd Hello");

        
// count from i = 4 to 10
        
int i = 4;
        
while (i <= 10) {
            
System.out.println(i + "th Hello");
            
i = i + 1;
        }

    }
}
