/*
Platform: LeetCode
Problem: Search Insert Position
Date: 01-04-2026

Problem:
Find index of target or insertion position.

Approach:
Binary Search

Idea:
Divide search space in half each time.
If not found, return low.

Time Complexity: O(log n)
Space Complexity: O(1)

Pattern:
Binary Search
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i <nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i;
            }

        }
        return nums.length;
        
    }
}
