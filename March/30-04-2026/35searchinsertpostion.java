/*
Platform: LeetCode
Problem: Search Insert Position
Date: 20-04-2026

Problem:
Find index of target or position where it should be inserted.

Approach:
Binary Search

Idea:
Use binary search.
If not found, return left pointer.

Time Complexity: O(log n)
Space Complexity: O(1)

Pattern:
Binary Search / Lower Bound
*/
class Solution {
    public int searchInsert(int[] nums, int target) {


        /*for(int i=0; i <nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i;
            }

        }
        return nums.length;*/
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid +1;

            }
            else{
                right = mid-1;
            }

        }
        return left;

        
    }
}
//tried to optimze the solution clearing basis as well
