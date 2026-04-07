/*
Platform: LeetCode
Problem: Contains Duplicate II
Date: 07-04-2026

Problem:
Check if there exist two indices i and j such that:
nums[i] == nums[j] AND |i - j| ≤ k

-------------------------------------

Approach:
Brute Force (Check All Pairs)

Idea:
Compare every element with its next elements.
For each pair (i, j):
- If values are equal
- And distance (j - i) ≤ k
→ return true

-------------------------------------

Steps:
1. Loop i from 0 to n-1
2. For each i, loop j from i+1 to n-1
3. If nums[i] == nums[j] AND (j - i) ≤ k:
       return true
4. If no such pair exists → return false

-------------------------------------

Optimization (Still Brute):
Limit inner loop to distance k:
j from i+1 to min(i+k, n-1)

-------------------------------------

Example:
Input: nums = [1,2,3,1], k = 3

Check pairs:
(0,1) → no
(0,2) → no
(0,3) → match AND distance ≤ 3 → TRUE

-------------------------------------

Time Complexity:
O(n²) → worst case
O(n * k) → optimized brute

Space Complexity:
O(1)

-------------------------------------

Pattern:
Brute Force / Pair Comparison

-------------------------------------

Key Insight:
Check all possible pairs first.
Then optimize by reducing unnecessary comparisons.
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j <= i + k && j < nums.length; j++){

                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
