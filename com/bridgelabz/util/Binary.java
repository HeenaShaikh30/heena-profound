/**************************************************************
*Compilation: javac -d bin com/bridgelabz/util/Binary.java
*Execution:   java -cp bin com.bridgelabz.util.Binary 
*purpose:   Program for converting into binary number.
*@author:  Heena Shaikh
*@version:1.0
*@since:10-8-2017
***************************************************************/
/*package Naming Style*/
package com.bridgelabz.util;

/*class Declaration*/
public class Binary{

/*Declaration of Main*/
public static void main(String[] args){

/*Read in the command line argument*/
int n=Integer.parseInt(args[0]);

/*set power to the largest power of 2 that is<=2*/
int power=1;
while(power<=n/2){
power*=2;
}

/*check for presence of powers of 2 in n, from largest to smallest*/
while(power>0){

/*power is not prsent in n*/
if(n<power){
System.out.print(0);
}

/*power is present in n, so substract power from n*/
else{
System.out.print(1);
n-=power;
}

/*next smallest power of 2*/
power/=2;
}
System.out.println();
}
}