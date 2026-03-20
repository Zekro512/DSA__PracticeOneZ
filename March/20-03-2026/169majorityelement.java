/*
Platform: LeetCode
Problem: Majority Element
Date: 20-03-2026

Problem:
Find the element that appears more than n/2 times.

Approach 1: Brute Force
Check frequency of each element.

Time: O(n^2)
Space: O(1)

-------------------------------------

Approach 2: HashMap
Count frequencies using map.

Time: O(n)
Space: O(n)

-------------------------------------

Approach 3: Boyer-Moore Voting Algorithm (Optimal)

Idea:
Cancel out different elements.
Majority element will always remain.

Steps:
1. Initialize candidate and count
2. If count == 0 → set candidate
3. If same → count++
4. Else → count--
5. Return candidate

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Greedy / Voting Algorithm
*/
class Solution{
  public int majorityelement(int[] nums){
    int candidate = 0;
    int count = 0;
    for(int num : nums){
      if(count == 0){
        candidate = num;
      }
      if(num == candidate){
        count++;
      } else{
        count--;
      }
    }
    return candidate;
  }
}
