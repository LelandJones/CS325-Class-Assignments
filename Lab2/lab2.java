package Lab2;
// lab2.java
// Leland Jones
// September 5, 2025
// calculates primes using Sieve of Eratosthenes
// demonstrates command line arguments and methods
// *** add answers to performance questions here ***

public class lab2 {

	public static void main(String[] args) 
	{
		int num = 0;
		
		//add code to get num from command line argument
		if (args.length > 0)
        {
            int N = 0;
            N = Integer.parseInt( args[0] );
            System.out.println( "N = " + N);
        }
        else
        {
            System.out.println("Missing argument");
        }
        
		//call showPrimes
		showPrimes( num );
		
	}//main
	
	public static void showPrimes(int N)
	{
		//add code to display primes		
	}//showPrimes
	
}//lab2