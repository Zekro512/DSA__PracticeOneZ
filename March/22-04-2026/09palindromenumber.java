/*
Platform: LeetCode
Problem: Palindrome Number
Date: 17-04-2026

Problem:
Check if integer is palindrome.

Approach:
Math (Half Reverse)

Idea:
Reverse half of number and compare.

Time Complexity: O(log n)
Space Complexity: O(1)

Pattern:
Math / Digit Manipulation
*/
class Solution {
    public boolean isPalindrome(int x) {
        if(x< 0) return false;
        int original = x;
        int rev = 0;
        while(x!=0){
            int digit = x%10;
            x = x/10;
            rev= rev*10+digit;
        }
        return original == rev;
    }
}
