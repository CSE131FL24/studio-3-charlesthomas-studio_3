package studio3;

import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n to find all prime numbers up to n: ");
        int n = scanner.nextInt();

        // Create a boolean array "isPrime[0..n]" and initialize
        boolean[] isPrime = new boolean[n];
        for (int i = 0; i < isPrime.length; i++) {
        	isPrime[i] = true; 
        }
        
        for (int x = 2; x < isPrime.length; x++) {
        	if (isPrime[x]) {
        		for (int v = x*x ; v < isPrime.length; v+=x) {
        			(isPrime[v]) = false;
        		}
        	}
        }
       
        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

