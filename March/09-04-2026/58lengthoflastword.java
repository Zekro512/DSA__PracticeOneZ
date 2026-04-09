/*
Platform: LeetCode
Problem: Length of Last Word
Date: 09-04-2026

Problem:
Find length of last word in a string.

Approach:
Reverse Traversal

Idea:
Start from end:
1. Skip trailing spaces
2. Count characters until space

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
String Traversal / Reverse Scan
*/
class Solution {
    public int lengthOfLastWord(String s) {

        String[] words = s.trim().split(" ");

        return words[words.length - 1].length();
    }
}
