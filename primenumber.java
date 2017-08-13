/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines whether InputNumber is prime or not and after that check the prime number is palindrom or not.
 *
 *  @author  Heena Shaikh
 ******************************************************************************/



class primenumber
 {
    public static void main(String[] args)
     {
        int i,j,sum=0,counter=1;
        //i and j creates two loops for pointing to numbers.
        //variable sum is used forfinding the sum of how many prime numbers are their
         System.out.println("sum of prime numbers is:");
          for(i=100000;i<=1000000;i++)
	   {	
	     for(j=100000;j<=1050000;j++)
		{
                  if(i%j==0)
        	  {System.out.println("Number is prime number");
		}   counter++;
                   sum=sum+counter;
		}
	}
         System.out.println("total cont of prime number is:"+sum);
}
}
