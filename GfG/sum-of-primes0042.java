/*
 * Problem: Sum Of Primes0042
 * Difficulty: Unknown
 * Language: Java (21)
 * Date: 2026-09-29
 * URL: https://www.geeksforgeeks.org/problems/sum-of-primes0042/1
 */

class Solution {
    static int primeSum(int n) {
        // code here
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum += digit;
            }
            n /= 10;
        }

        return sum;
    }
}