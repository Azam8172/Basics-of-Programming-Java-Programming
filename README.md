# Basics-of-Programming-Java-Programming


Number of primes
easy
Time Limit: 20 sec
Memory Limit: 128000 kB
Problem Statement
Given a number n find the number of prime numbers less than equal to that number.
Input
There is only one integer containing value of n.

Constraints:-
1 <= n <= 10000000
Output
Return number of primes less than or equal to n
Example
Sample Input
5

Sample Output
3

Explanation:-
2 3 and 5 are the required primes.

Sample Input
5000

Sample Output
669

/////////////////////*******************////////////////////




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                        Scanner sc = new Scanner(System.in);
					  int n = sc.nextInt();
					  boolean[] isPrime = sievePrimeFactors(n);
					  int count = 0;
					  for(int i=2;i<=n;i++)
					  {
						  if(isPrime[i])
						  {
							  count++;
						  }
					  } 
					System.out.println(count);
				}
				static boolean[] sievePrimeFactors(int n)
					  {
						  boolean[] bool = new boolean[n+1];
						  Arrays.fill(bool,true);
						  for (int i = 2; i<= Math.sqrt(n); i++){
							  if(bool[i]) {
								  for(int j = (i*i); j<=n ; j+=i){
									  bool[j] = false;
								  }
							  }
						  }
						  return bool;
    }
}
