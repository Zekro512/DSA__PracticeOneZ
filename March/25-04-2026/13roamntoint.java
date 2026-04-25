/*
Platform: LeetCode
Problem: Roman to Integer
Date: 18-04-2026

Problem:
Convert Roman numeral to integer.

Approach:
Greedy / Sequential Traversal

Idea:
If current value < next value → subtract
Else → add

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
String Parsing / Greedy
*/
class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for(int i = 0; i < s.length(); i++){

            int curr = getValue(s.charAt(i));

            if(i < s.length() - 1 && curr < getValue(s.charAt(i + 1))){
                total -= curr;
            }
            else{
                total += curr;
            }
        }

        return total;
    }

    private int getValue(char c){
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return 0;
    }
}
