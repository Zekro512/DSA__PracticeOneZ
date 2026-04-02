/*
Platform: LeetCode
Problem: Remove Element
Date: 02-04-2026

Problem:
Remove all occurrences of val in-place.

Approach:
Two Pointer (Overwrite)

Idea:
Use one pointer to scan, one to place valid elements.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Two Pointer / Array Filtering
*/
class Solution{
  public int removeElement(int[] nums , int val){
    int k = 0;
    for(int i = 0; i<nums.length; i++){
      if(nums[i] != val){
        nums[i] = nums[k];
        k++
          }
    }
    return k;
  }
}
