/*
Platform: LeetCode
Problem: Max Consecutive Ones
Date: 17-03-2026

Problem:
Given a binary array nums, return the maximum number of
consecutive 1s in the array.

Example:
Input: [1,1,0,1,1,1]
Output: 3

Approach:
Array Traversal / Counting Streak

Idea:
Traverse the array and count consecutive 1s.
If we encounter 0, reset the current count.

We track:
currentCount → current streak of 1s
maxCount → maximum streak seen so far

Steps:
1. Initialize currentCount = 0 and maxCount = 0
2. Traverse the array
3. If element == 1
       currentCount++
       update maxCount
4. If element == 0
       reset currentCount = 0
5. Return maxCount

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Array Traversal / Longest Streak
*/
class Solution{
  public int findMaxConsecutiveOnes(int[] nums) {
    int currentCount =0;
    int maxCount=0;
    for(int num : nums){
      if(num == 1){
        currentCount++;
        maxCount = Math.max(currentCount , maxCount);
      }
      else{
        currentCount = 0;
      }
    }
    return maxCount;
  }
}
