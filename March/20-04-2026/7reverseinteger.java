/*
Platform: LeetCode
Problem: Reverse Integer
Date: 15-04-2026

Problem:
Reverse digits of integer with overflow check.

Approach:
Digit Extraction

Idea:
Extract digits using %10 and rebuild number.
Check overflow before multiplying.

Time Complexity: O(log n)
Space Complexity: O(1)

Pattern:
Math / Digit Manipulation
*/
class Solution {
    public int reverse(int x) {

        int rev = 0;

        while(x != 0){

            int digit = x % 10;
            x = x / 10;

            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}
