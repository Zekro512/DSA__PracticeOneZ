/*
Platform: LeetCode
Problem: Plus One
Date: 29-03-2026

Problem:
Add 1 to a number represented as array.

Approach:
Right-to-left traversal with carry handling

Idea:
If digit < 9 → increment and stop
If digit == 9 → set to 0 and carry forward
If all digits are 9 → create new array

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Carry Handling / Array Manipulation
*/
class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--){

            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
