/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Ruler.java
*Execution:   java -cp bin com.bridgelabz.util.Ruler 
*purpose:   Program for ruler.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/


public class Ruler { 
    
public static void main(String[] args) { 
        
String ruler1 = " 1 ";
        
String ruler2 = ruler1 + "2" + ruler1;
        
String ruler3 = ruler2 + "3" + ruler2;
        
String ruler4 = ruler3 + "4" + ruler3;
        
String ruler5 = ruler4 + "5" + ruler4;

        
System.out.println(ruler1);
        
System.out.println(ruler2);
        
System.out.println(ruler3);
        
System.out.println(ruler4);
        
System.out.println(ruler5);
    }

}
