package com.company;

public class RecursiveFibonacci { // two recursive fibonacci sequence generating algorithms

    //Variable declarations
    private static long slowCount = 0;
    private static short fastCount = 0;
    private static long [] fast = new long [100]; // memory used to prevent repeat calculations

    public static void main(String[] args) {
        // main class used for testing the algorithms

        byte testNumber = 40;
        System.out.println("Slow Fibonacci algorithm(" + testNumber + "): " + slowFibonacci(testNumber));
        System.out.println("Faster Fibonacci algorithm(" + testNumber + "): " + fastFibonacci(testNumber));
        // after the faster algorithm has calculated a term, it will store it in the 'fast' array
        // it won't repeat calculations if it has the term in storage. this is what makes it faster
        System.out.println("Faster Fibonacci algorithm second test(" + testNumber + "): " + fastFibonacci(testNumber));
        // the second test result should be printed instantly as no further calculations are required

        //This is the number of calculations each one used. The count is increased every time the algorithm runs
        System.out.println("Slow method calculation count: " + slowCount + ", Fast method calculation count: " + fastCount);

    } // end of main method

    private static long slowFibonacci(byte term) {
        // this is a simple recursive algorithm
        // due to the lack of storage used in this algorithm, there are many repeated calculations that slow it down
        if (term < 3){
            return 1;
        }
        slowCount++;
        return slowFibonacci((byte) (term-1)) + slowFibonacci((byte) (term-2));
    } // end of slowFibonacci method


    private static long access(byte term){
        // this is a helper method for fastFibonacci()
        if (fast[term] == 0) { // only calculate the term if necessary
            fast[term] = fastFibonacci(term);
        }
        return fast[term]; // return the value stored in the array
    } // end of access method

    private static long fastFibonacci(byte term){
        if(term<3){
            fast[term] = 1;
        } else {
            fast[term] = access((byte) (term - 1)) + access((byte) (term - 2));
        }
        fastCount++;
        return fast[term];
    } // end of fastFibonacci method
}
