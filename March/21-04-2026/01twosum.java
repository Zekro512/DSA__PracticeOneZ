/*
Platform: LeetCode
Problem: Two Sum
Date: 16-04-2026

Problem:
Find two indices such that nums[i] + nums[j] = target.

Approach:
HashMap

Idea:
For each number, compute required value (target - num).
Check if it exists in map.

Time Complexity: O(n)
Space Complexity: O(n)

Pattern:
Hashing / Complement Search
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
