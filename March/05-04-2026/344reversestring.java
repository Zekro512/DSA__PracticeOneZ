/*
Platform: LeetCode
Problem: Reverse String
Date: 05-04-2026

Problem:
Reverse a character array in-place.

Approach:
Two Pointer

Idea:
Swap elements from both ends moving towards center.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Two Pointer / In-place Array Manipulation
*/
class Solution {
    public void reverseString(char[] s) {

        char[] temp = new char[s.length];

        for(int i = 0; i < s.length; i++){
            temp[i] = s[s.length - 1 - i];
        }

        for(int i = 0; i < s.length; i++){
            s[i] = temp[i];
        }
    }
}
