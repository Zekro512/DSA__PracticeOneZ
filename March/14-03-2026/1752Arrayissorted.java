/*
Platform: LeetCode
Problem: 1752. Check if Array Is Sorted and Rotated
Date: 13-03-2026

Problem:
Given an array nums, determine if the array was originally sorted in
non-decreasing order and then rotated some number of times.

Duplicates may exist in the array.

Approach:
Array Traversal with Rotation Check

Idea:
In a sorted array, elements always increase or stay equal.

If the array is rotated, there will be exactly one point where the
order decreases.

Example:
[3,4,5,1,2]

Sorted part → 3,4,5
Drop occurs → 5 → 1
Remaining part → 1,2

So we count how many times:
nums[i] > nums[i+1]

We also check the circular condition using:
nums[(i+1) % n]

If the number of drops is greater than 1,
the array cannot be sorted and rotated.

Steps:
1. Traverse the array.
2. Count positions where nums[i] > nums[(i+1)%n].
3. If count > 1 return false.
4. Otherwise return true.

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Array Traversal / Rotated Sorted Array
*/
class Solution{
  public boolean check(int[] nums){
    int count = 0;
    int n = nums.length;
    for(int i = 0; i<n; i++){
      if(nums[i] > nums[(i +1) % n]){
        count ++
          }
      if(count>1){
        return false;
      }
    }
    return true;
  }
}
