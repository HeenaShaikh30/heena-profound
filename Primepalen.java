/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines whether InputNumber is prime or not.
 *
 *  @author  Heena Shaikh
 ******************************************************************************/

import java.util.Scanner;
public class Primepalen{

public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
     int InputNumber, number,ctr1,ctr2=1,ctr3=1,rev=0;
     System.out.println("Enter a number InputNumber:");
           InputNumber=scanner.nextInt();
           number=InputNumber;
           for(ctr1=1;ctr1<=100000;ctr1++){
           if((InputNumber%number==0)&&(InputNumber%ctr1==0)){
           ctr2++;}}

              if(ctr2==2){
              System.out.println("prime number is:"+InputNumber);
              ctr3++; }
              else{
              System.out.println("number is not a primr:"+InputNumber);}
              System.out.println(" List of prime number is:"+ctr3);
  
                  while(number!=0){
                  rev=rev*10;
                  rev=rev+number%10;
                  number=number/10;}
                  if( number==rev){
                  System.out.println("number is not a prime and palen:"+number);}
    
  }
}
