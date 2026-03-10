/*
Platform: LeetCode
Problem: 9. Palindrome Number
Date: 10-03-2026

Problem:
Given an integer x, return true if x is a palindrome and false otherwise.

A palindrome number reads the same forward and backward.

Example:

Input: x = 121
Output: true

Input: x = -121
Output: false

Input: x = 10
Output: false

Approach:
Digit Extraction and Reverse Comparison

Idea:
A number is a palindrome if the number remains the same when its digits are reversed.

Steps:
1. Store the original number.
2. Reverse the digits using modulus (%) and division (/).
3. Compare the reversed number with the original number.

If both are equal → palindrome.
Otherwise → not a palindrome.

Special Case:
Negative numbers are not palindromes.

Example Dry Run:

x = 121

digit = 1
rev = 1
x = 12

digit = 2
rev = 12
x = 1

digit = 1
rev = 121
x = 0

rev == original → true

Time Complexity: O(log10(n))

Space Complexity: O(1)

Pattern:
Digit Manipulation / Math
*/
class solution;
public boolean ispalindrome(int x){
  if(x<0){
    retrun false;
  }
  int original = x;
  int rev =0;
  while(x!=0){
    int digit = x%10;
    rev = rev*10 + digit;
    x=x/10;
  }
  return rev == original;
}
  }
