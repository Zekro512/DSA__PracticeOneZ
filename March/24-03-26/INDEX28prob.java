/*
Platform: LeetCode
Problem: Find First Occurrence in String
Date: 23-03-2026

Problem:
Find the first index where needle appears in haystack.

Approach:
Brute Force (String Matching)

Idea:
Try every possible starting index and match characters one by one.

Steps:
1. Loop from 0 to n-m
2. Compare characters using inner loop
3. If full match → return index
4. Else continue

Time Complexity: O(n*m)
Space Complexity: O(1)

Pattern:
String Matching / Substring Search
*/
class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n - m; i++){

            int j = 0;

            while(j < m && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }

            if(j == m){
                return i;
            }
        }

        return -1;
    }
}
