/*
Platform: LeetCode
Problem: Contains Duplicate
Date: 06-04-2026

Problem:
Check if any element appears more than once.

Approach:
HashSet

Idea:
Store elements in set.
If element already exists → duplicate found.

Time Complexity: O(n)
Space Complexity: O(n)

Pattern:
Hashing / Duplicate Detection
*/
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }

        return false;
    }
}
