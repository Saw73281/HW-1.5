package org.example;

public class Fibonacci {
    public static int iterativeFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int recursiveFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return 0;
        if (n == 1) return 1;

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int dynamicFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Iterative Fibonacci(" + n + "): " + iterativeFibonacci(n));
        System.out.println("Recursive Fibonacci(" + n + "): " + recursiveFibonacci(n));
        System.out.println("Dynamic Fibonacci(" + n + "): " + dynamicFibonacci(n));
    }
}
