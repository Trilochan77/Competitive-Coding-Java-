/*
 * Problem: Trapping Rain Water
 * Difficulty: Hard
 * Language: Java (21)
 * Date: 2026-11-06
 * URL: https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
 */

    public int maxWater(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    res += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    res += rightMax - arr[right];
                }
                right--;
            }
        }
        return res;
    }
}