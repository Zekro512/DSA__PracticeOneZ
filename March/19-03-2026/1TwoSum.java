/*
Platform: LeetCode
Problem: Two Sum
Date: 19-03-2026

Problem:
Given an array nums and a target, return indices of two numbers
such that they add up to target.

-------------------------------------
Approach 1: Brute Force

Idea:
Check all possible pairs and find the pair that sums to target.

Time Complexity: O(n^2)
Space Complexity: O(1)

-------------------------------------
Approach 2: HashMap (Optimized)

Idea:
For each element, compute:
needed = target - nums[i]

Check if needed element exists in map.

If yes → return indices
If no → store current element

Time Complexity: O(n)
Space Complexity: O(n)

-------------------------------------
Pattern:
HashMap / Complement Lookup
*/
class Solution{
  public int twosum(int[] nums int target){
    for(int i = 0; i<nums.length; i++){
      for(int j = i+1; j<nums.length; j++){
        if(nums[i] + nums[j] == target){
          return new int[]{i,j};
        }
      }
    }
    return new int[]{};
  }
}
