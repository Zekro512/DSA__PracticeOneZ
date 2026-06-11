# Factorial of a Number

## Difficulty
Easy

## Approach Used
Iterative Loop

## Intuition
Factorial is the product of all positive integers from 1 to n.

## Algorithm
1. Initialize fact = 1.
2. Traverse from 1 to n.
3. Multiply fact by current number.
4. Return fact.

## Dry Run

Input:
n = 5

fact = 1

1 → 1
2 → 2
3 → 6
4 → 24
5 → 120

Output = 120

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Concepts Learned
- for loop
- multiplication accumulation
- factorial definition
- iterative programming

## Common Mistakes
- Starting fact with 0
- Using i < n instead of i <= n
- Forgetting that 0! = 1

## Interview Explanation
Multiply all numbers from 1 to n using a loop. The algorithm runs in O(n) time and O(1) space.

  //Brute force approach
  class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }

            result.add(subset);
        }

        return result;
    }
}
