/*
Platform: LeetCode
Problem: Longest Common Prefix
Date: 28-03-2026

Problem:
Find longest prefix common to all strings.

Approach:
Horizontal Scanning

Idea:
Start with first string.
Reduce prefix until it matches all strings.

Time Complexity: O(n * m)
Space Complexity: O(1)

Pattern:
String Comparison / Prefix Matching
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
        
    }
}
