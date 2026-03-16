/*
Platform: LeetCode
Problem: Move Zeroes
Date: 16-03-2026

Problem:
Given an integer array nums, move all 0's to the end while maintaining
the relative order of the non-zero elements.

The operation must be done in-place without using extra space.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Approach:
Two Pointer Technique (Fast and Slow Pointer)

Idea:
We maintain two pointers.

slow → position where next non-zero element should go
fast → scans the array

Whenever we find a non-zero element, we swap it with the
element at the slow pointer and move slow forward.

Steps:
1. Initialize slow = 0
2. Traverse array using fast pointer
3. If nums[fast] != 0
       swap nums[slow] and nums[fast]
       slow++
4. Continue until end

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Two Pointers / Fast-Slow Pointer
*/
class Solution{
  public void removeZero(int[] nums){
    int slow = 0;
    for(int fast = 0; fast < nums.length; fast++){
      if(nums[fast] != 0){
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
        slow++;
      }
    }
  }
}
