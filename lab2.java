// lab2.java
// Leland Jones
// September 5, 2025
// calculates primes using Sieve of Eratosthenes
// demonstrates command line arguments and methods
//
// 1. What is the maximum prime number you can find using your program?
// I was able to get to 100,000,000 but it took around 6 minutes. The max number depends on memory available.
//
// 2. How does printing vs. not printing the numbers affect performance?
// Printing the numbers takes time and slows down the program. Not printing them improves performance.
//
// 3. What factors limit your program from finding larger prime numbers?
// Memory is a major factor as well as CPU time.


public class lab2 {

	public static void main(String[] args) 
	{
		int N = 1000;
		
		//add code to get num from command line argument
		if (args.length > 0)
        {
            N = Integer.parseInt( args[0] );
            System.out.println( "N = " + N);
        }
        else
        {
            System.out.println("No user input. N= 1000");
        }
        
		//call showPrimes
		showPrimes( N );
		
	}//main
	
	public static void showPrimes(int N)
	{
		boolean[] isPrime = new boolean[N+1];
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int i = 2; i <= N; i++)
        {
            isPrime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(N); i++)
        {
            if (isPrime[i]) 
            {
                for (int j = i * i; j <= N; j += i)
                {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++)
        {
            if (isPrime[i])
            {
                System.out.print(i + " ");
            }
        }

	}//showPrimes
	
}//lab2