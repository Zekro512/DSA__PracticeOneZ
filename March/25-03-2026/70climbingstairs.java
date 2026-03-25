/*
Platform: LeetCode
Problem: Climbing Stairs
Date: 24-03-2026

Problem:
Find number of ways to reach nth step using 1 or 2 steps.

Approach:
Dynamic Programming (Fibonacci)

Idea:
To reach step n:
- from n-1 (1 step)
- from n-2 (2 steps)

So:
ways(n) = ways(n-1) + ways(n-2)

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Dynamic Programming / Fibonacci
*/
class Solution {
    public int climbStairs(int n) {

        if(n == 1) return 1;

        int prev2 = 1; // ways(1)
        int prev1 = 2; // ways(2)

        for(int i = 3; i <= n; i++){

            int current = prev1 + prev2;

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
