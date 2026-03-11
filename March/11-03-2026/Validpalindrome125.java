/*
Platform: LeetCode
Problem: 125. Valid Palindrome
Date: 11-03-2026

Problem:
A phrase is a palindrome if after converting all uppercase letters to
lowercase and removing all non-alphanumeric characters, it reads the
same forward and backward.

Alphanumeric characters include letters and numbers.

Approach:
Two Pointer Technique

Idea:
Use two pointers to compare characters from both ends of the string.

Steps:
1. Initialize two pointers:
   left = 0
   right = s.length - 1

2. Move pointers toward each other.

3. Skip characters that are not alphanumeric.

4. Compare characters after converting them to lowercase.

5. If characters don't match → return false.

6. If pointers cross without mismatch → return true.

Example:
Input:
"A man, a plan, a canal: Panama"

After ignoring spaces and symbols:
"amanaplanacanalpanama"

Forward and backward comparison matches → true

Time Complexity: O(n)

Space Complexity: O(1)

Pattern:
Two Pointers
*/
class Solution{
  public boolean ispalindrome(String s){
    int left = 0;
    int right = s.length()-1;
    while(left<right){
      if(!Character.LetterOrDigit(l)){
        left++;
        continue;
      }
      if(!Character.LetterOrDigit(r)){
        right--;
        continue;
      }
      if(Character.toLowercase(l) != Character.toLowercase(r)){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
