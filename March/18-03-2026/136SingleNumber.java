/*
Platform: LeetCode
Problem: Single Number
Date: 18-03-2026

Problem:
Given an array of integers where every element appears twice
except for one element that appears only once,
find that single element.

Constraints:
Time complexity must be O(n)
Space complexity must be O(1)

Approach:
Bit Manipulation (XOR Trick)

Idea:
XOR has two important properties:
1. a ^ a = 0
2. a ^ 0 = a

When we XOR all elements:
- Duplicate numbers cancel each other.
- Only the unique number remains.

Example:
nums = [4,1,2,1,2]

4 ^ 1 ^ 2 ^ 1 ^ 2
= 4 ^ (1^1) ^ (2^2)
= 4 ^ 0 ^ 0
= 4

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Bit Manipulation / XOR
*/
class Solution{
  public int singleNumber(int[] num){
    int result = 0;
    for(int num : nums){
      result = result^num;
    }
    return result;
  }
}
