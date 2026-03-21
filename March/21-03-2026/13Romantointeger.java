/*
Platform: LeetCode
Problem: 13. Roman to Integer
Date: 21-03-2026

Problem:
Convert a Roman numeral string into an integer.

Approach:
String Traversal with Lookahead

Idea:
If a smaller value comes before a larger value,
we subtract it. Otherwise, we add it.

Steps:
1. Create a map for Roman values
2. Traverse the string
3. If current < next → subtract
4. Else → add

Example:
MCMXCIV → 1994

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
String Traversal / Conditional Logic
*/
class Solution {

    public int romanToInt(String s) {

        int result = 0;

        for(int i = 0; i < s.length(); i++){

            int current = getValue(s.charAt(i));

            if(i < s.length() - 1 && current < getValue(s.charAt(i + 1))){
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    private int getValue(char c){

        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        return 1000; // 'M'
    }
}
