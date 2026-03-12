/*
Platform: LeetCode
Problem: 509. Fibonacci Number
Date: 12-03-2026

Problem:
The Fibonacci sequence is defined as:

F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2)

Given an integer n, return F(n).

Example:

Input: n = 4
Output: 3

Explanation:
F(4) = F(3) + F(2)
     = 2 + 1
     = 3

Approach:
Iterative Dynamic Programming

Idea:
Instead of recalculating Fibonacci values using recursion,
we build the sequence iteratively.

Since each Fibonacci number depends only on the previous
two numbers, we store them in variables and update them
in a loop.

Steps:
1. Handle base cases (n <= 1).
2. Initialize two variables:
   prev1 = 1
   prev2 = 0
3. Iterate from 2 to n.
4. Compute current = prev1 + prev2.
5. Update prev2 and prev1.
6. Return prev1.

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Dynamic Programming / Iterative DP
*/
class Solution{
  public int fib(int x){
    if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
    int ans(fib(n-1) + fib(n-2);
    return ans;
  }
}
