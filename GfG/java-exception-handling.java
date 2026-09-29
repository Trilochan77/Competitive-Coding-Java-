/*
 * Problem: Java Exception Handling
 * Difficulty: Medium
 * Language: Java (21)
 * Date: 2026-09-29
 * URL: https://www.geeksforgeeks.org/problems/java-exception-handling-1606978567/1
 */

class Solution {
    public int findMin(int a, int b) {
        // code here
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int minVal = Math.min(add, Math.min(sub, mul));

                try {
                    int div = a / b;
                    minVal = Math.min(minVal, div);
                } catch (ArithmeticException e) {
                    // Division by zero occurred; ignore division and keep minVal as is
                }

                return minVal;
    }
}