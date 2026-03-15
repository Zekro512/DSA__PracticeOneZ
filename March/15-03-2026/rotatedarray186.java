/*
Platform: LeetCode
Problem: 189. Rotate Array
Date: 15-03-2026

Problem:
Given an integer array nums, rotate the array to the right by k steps.

Example:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Approach:
Array Reversal Technique

Idea:
Instead of shifting elements one by one, we use a reverse trick.

Steps:
1. Reverse the entire array.
2. Reverse the first k elements.
3. Reverse the remaining n-k elements.

Example:
[1,2,3,4,5,6,7]

Reverse whole → [7,6,5,4,3,2,1]
Reverse first k → [5,6,7,4,3,2,1]
Reverse rest → [5,6,7,1,2,3,4]

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Array Manipulation / Reversal Trick
*/
class Solution{
  public void rotate(int[] nums, int k){
    int n = nums.length;
    k=k%n;
    reverse(nums, 0, n-1);
    reverse(nums, 0, n-1);
    reverse(nums, k, n-1);
  }
  private void reverse(int[] nums, int left, int right){
    while(left<right){
      int temp = nums[left];
      nums[right] = nums[left];
      nums[right] = temp;

    left++;
    right--;
    }
  }
