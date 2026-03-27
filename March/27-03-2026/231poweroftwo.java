/*
Platform: LeetCode
Problem: Power of Two
Date: 26-03-2026

Approach: Brute Force

Idea:
Keep dividing the number by 2.
If we reach 1 → it is a power of 2.
If we get stuck before reaching 1 → not a power of 2.

Steps:
1. If n <= 0 → false
2. While n % 2 == 0:
       n = n / 2
3. If n == 1 → true else false

Time Com
plexity: O(log n)
Space Complexity: O(1)

Pattern:
Math / Division Reduction
*/
class Solution{
  public boolean ispowerofTwo{
    if(n<=0){
      return false;
    }
    while(n % 2 == 0){
      n = n/2;
    }
    return n == 1;
  }
}
