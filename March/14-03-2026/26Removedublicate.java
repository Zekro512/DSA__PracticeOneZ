/*
Platform: LeetCode
Problem: 26. Remove Duplicates from Sorted Array
Date: 14-03-2026

Problem:
Given a sorted array nums, remove the duplicates in-place such that
each unique element appears only once.

Return the number of unique elements k. The first k elements of nums
should contain the unique elements in sorted order.

Approach:
Two Pointer Technique (Fast and Slow Pointer)

Idea:
Since the array is sorted, duplicates appear next to each other.

We use two pointers:
slow → tracks position of last unique element
fast → scans the array

Whenever nums[fast] != nums[slow], we found a new unique element.
We move slow forward and place the new element there.

Steps:
1. Initialize slow = 0
2. Traverse the array using fast pointer
3. If nums[fast] != nums[slow]
       slow++
       nums[slow] = nums[fast]
4. Return slow + 1

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Two Pointers / Fast and Slow Pointer
*/
class Solution{
  public int removedublicate(int[] nums){
    int slow = 0;
    for(int fast = 1; fast<nums.length; fast++){
      if(nums[slow] != nums[fast]){
        slow++
          nums[slow] = nums[fast];
      }
    }
    return slow+1
      }
}
