/*
 * Problem: First Negative Integer In Every Window Of Size K3345
 * Difficulty: Medium
 * Language: Java (21)
 * Date: 2026-11-06
 * URL: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
 */

            result.add(0);
        }

        for (int i = k; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            if (arr[i] < 0) {
                dq.addLast(i);
            }

            if (!dq.isEmpty()) {
                result.add(arr[dq.peekFirst()]);
            } else {
                result.add(0);
            }
        }

        return result;
    }
}