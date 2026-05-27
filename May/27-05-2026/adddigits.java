/*
Platform: LeetCode
Problem: Add Digits
Date: 24-04-2026

Problem:
Repeatedly add digits until single digit remains.

Approach:
Digit Extraction

Idea:
Extract digits using %10 and /10.
Repeat process until number becomes single digit.

Time Complexity: O(log n)
Space Complexity: O(1)

Pattern:
Math / Digit Manipulation
*/
class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num%10;
                num = num/10;

            }
            num = sum;

        }
        return num;

    }
}
