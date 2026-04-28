/*
Platform: LeetCode
Problem: Longest Common Prefix
Date: 19-04-2026

Problem:
Find longest common prefix among strings.

Approach:
Character-by-Character Comparison

Idea:
Compare characters at same index across all strings.
Stop at mismatch.

Time Complexity: O(n * m)
Space Complexity: O(1)

Pattern:
String Traversal / Comparison

class Solution {
    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i =0;
         while(i < first.length() && i < last.length() 
              && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0,i);

    }
}
*/
class Solution {
    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i =0;
         while(i < first.length() && i < last.length() 
              && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0,i);

    }
}
