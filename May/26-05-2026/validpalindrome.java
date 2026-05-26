/*
Platform: LeetCode
Problem: Valid Palindrome
Date: 23-04-2026

Problem:
Check if string is palindrome after removing
non-alphanumeric characters.

Approach:
Two Pointer

Idea:
Use left and right pointers.
Skip symbols/spaces.
Compare lowercase characters.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
String / Two Pointer
*//*
Platform: LeetCode
Problem: Valid Palindrome
Date: 23-04-2026

Problem:
Check if string is palindrome after removing
non-alphanumeric characters.

Approach:
Two Pointer

Idea:
Use left and right pointers.
Skip symbols/spaces.
Compare lowercase characters.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
String / Two Pointer
*/
class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            // skip non-alphanumeric
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else{

                if(l != r){
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}
