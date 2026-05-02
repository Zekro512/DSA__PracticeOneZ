/*
Platform: LeetCode
Problem: Find the Index of First Occurrence in a String
Date: 21-04-2026

Problem:
Find first occurrence of substring in string.

Approach:
Brute Force (String Matching)

Idea:
Check substring starting at each index.

Time Complexity: O(n * m)
Space Complexity: O(1)

Pattern:
String Matching / Sliding Comparison
*/
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i=0; i<=n-m; i++){
            int j = 0;
        while(j < m && haystack.charAt(i + j) == needle.charAt(j)){
            j++;
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
}
//TRIED TO OPTIMIZE THE SOLUTION IN MORE SIMPLE WAY
