package com.kevinmichie;

import java.util.Scanner;

public class Fibonacci {

    public long fibonacciDP(int n) {
        long[] results = new long[n+1];
        results[1] = 1;
        results[2] = 1;
        for (int i = 3; i <= n; i++) {
            results[i] = results[i-1] + results[i-2];
        }
        return results[n];
    }

    public long betterFibDP(int n){
        long n1 = 1;
        long n2 = 1;
        long current = 2;
        for (int i = 3; i <=n; i++){
            current = n1 + n2;
            n2 = n1;
            n1 = current;
        }
        return current;
    }


    public static void main(String[] args) {
	    Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();

        long result = fibonacci.fibonacciDP(numberFromUser);
        System.out.println(result);
    }
}


   /* Can the problem be divided into subproblems of the same kind?
      Can I define the previous division by a recurrence definition? That is, define F(n) as a function of F(n-1)
      Will I need the results to the sub-problems multiple times or just once?
      Does it make more sense to use a top-down or a bottom-up approach?
      Do I need to worry about the stack if I use a memoized recursive approach?
      Do I need to keep all previous results or can I optimize the space and keep just some of them? */

// https://www.javacodegeeks.com/2014/02/dynamic-programming-introduction.html