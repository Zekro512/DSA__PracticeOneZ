/*
Platform: LeetCode
Problem No: 209
Problem Name: Minimum Size Subarray Sum
Difficulty: Medium
Date: DD-MM-YYYY

Problem:
Given an array of positive integers nums and a positive integer target,
return the minimal length of a contiguous subarray whose sum is
greater than or equal to target.
If no such subarray exists, return 0.

Example:
target = 7
nums = [2,3,1,2,4,3]

Output = 2
Explanation:
Subarray [4,3] has sum = 7 and length = 2.

--------------------------------------------------

Brute Force Approach:

Idea:
1. Start from every index i.
2. Keep adding elements from i to j.
3. Whenever sum >= target:
   - Calculate subarray length.
   - Update minimum length.
   - Break because any further extension
     will only increase length.

Algorithm:
1. Run outer loop from i = 0 to n-1.
2. Initialize sum = 0.
3. Run inner loop from j = i to n-1.
4. Add nums[j] to sum.
5. If sum >= target:
      minLen = min(minLen, j - i + 1)
      break

Time Complexity:
O(n²)

Space Complexity:
O(1)

Pattern:
Array + Nested Loop + Brute Force

--------------------------------------------------

Important Observation:

Length of subarray:

length = endingIndex - startingIndex + 1

length = j - i + 1

Common Mistake:
❌ j - 1 + i
✅ j - i + 1

--------------------------------------------------

Optimal Approach:

Pattern:
Sliding Window

Why Sliding Window Works?
Because all numbers are positive.

If sum becomes larger than target:
moving left pointer forward always decreases sum.

Time Complexity:
O(n)

Space Complexity:
O(1)

Recognition Pattern:

If Question Contains:
✓ Contiguous Subarray
✓ Positive Numbers
✓ Minimum/Maximum Length
✓ Sum Condition

Think:
→ Sliding Window

--------------------------------------------------

Learning:

1. Be careful with subarray length formula.
2. Always dry run with indices.
3. Verify boundary conditions.
4. Correct approach can fail due to one index mistake.
*/
