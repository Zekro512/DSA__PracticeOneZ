/*
Platform: LeetCode
Problem: Sort Array By Parity
Date: 03-04-2026

Problem:
Rearrange the array so that all even numbers appear first,
followed by all odd numbers. Order does not matter.

-------------------------------------

Approach:
Two Pointer (Stable Partition / Overwrite via Swap)

Idea:
Use two pointers:
- i → scans the array
- j → tracks position where next even number should go

Whenever an even number is found:
→ swap it with element at index j
→ increment j

This ensures:
- All elements before j are even
- Remaining elements are odd or unprocessed

-------------------------------------

Steps:
1. Initialize j = 0
2. Traverse array with i from 0 to n-1
3. If nums[i] is even:
       swap(nums[i], nums[j])
       increment j
4. Return modified array

-------------------------------------

Example:
Input: [3,1,2,4]

Step-by-step:
i=0 → 3 (odd) → skip
i=1 → 1 (odd) → skip
i=2 → 2 (even) → swap with nums[0] → [2,1,3,4]
i=3 → 4 (even) → swap with nums[1] → [2,4,3,1]

Output: [2,4,3,1]

-------------------------------------

Time Complexity: O(n)
Space Complexity: O(1)

-------------------------------------

Pattern:
Two Pointer / Array Partitioning

-------------------------------------

Key Insight:
j always points to the position where the next valid (even) element should go.
*/
class Solution{
  public int[] sortArrayByparity(int[]nums){
    int j =0;
    for(int i = 0; i<nums.length; i++){
      if(nums[i] %2 ==0){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++
          }
    }
    return nums;
  }
}
