# LeetCode 53. Maximum Subarray

## Problem Link

https://leetcode.com/problems/maximum-subarray/

## Difficulty

Medium

## Tags

* Array
* Dynamic Programming
* Kadane's Algorithm
* Prefix Sum

---

## Problem Statement

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

### Example

Input:
nums = [-2,1,-3,4,-1,2,1,-5,4]

Output:
6

Explanation:
The subarray [4,-1,2,1] has the largest sum of 6.

---

## Approach 1: Brute Force (O(n²))

### Idea

Generate all possible subarrays and calculate their sums while maintaining the maximum sum encountered.

### Algorithm

1. Start from each index `i`.
2. Extend the subarray to every index `j`.
3. Maintain a running sum.
4. Update the maximum sum.

### Complexity

* Time: O(n²)
* Space: O(1)

---

## Approach 2: Optimal (Kadane's Algorithm)

### Intuition

A negative running sum can never contribute to a future maximum subarray. Therefore, whenever the current sum becomes negative, reset it to 0.

### Algorithm

1. Initialize:

   * `currentSum = 0`
   * `maxSum = nums[0]`
2. Traverse the array:

   * Add current element to `currentSum`.
   * Update `maxSum`.
   * If `currentSum < 0`, reset it to 0.
3. Return `maxSum`.

### Complexity

* Time: O(n)
* Space: O(1)

---

## Java Solution

```java
class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
```

---

## Dry Run

Input:
[-2,1,-3,4,-1,2,1,-5,4]

| Element | Current Sum | Max Sum |
| ------- | ----------- | ------- |
| -2      | -2 → 0      | -2      |
| 1       | 1           | 1       |
| -3      | -2 → 0      | 1       |
| 4       | 4           | 4       |
| -1      | 3           | 4       |
| 2       | 5           | 5       |
| 1       | 6           | 6       |
| -5      | 1           | 6       |
| 4       | 5           | 6       |

Answer = 6

---

## Key Learning

* Negative prefix sums should be discarded.
* Kadane's Algorithm is a Dynamic Programming optimization.
* This pattern is useful in many DP and Array interview problems.

---

## Interview Follow-up

Can you also return the actual subarray with the maximum sum instead of only the sum?
