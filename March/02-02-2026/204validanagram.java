/*
Platform: LeetCode
Problem: Valid Anagram
Date: 04-04-2026

Problem:
Check if two strings are anagrams.

Approach:
Frequency Count (Array)

Idea:
Use array of size 26.
Increase count for s, decrease for t.

If all values are 0 → anagram.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Hashing / Frequency Count
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;  // increase
            count[t.charAt(i) - 'a']--;  // decrease
        }

        for(int c : count){
            if(c != 0) return false;
        }

        return true;
    }
}
