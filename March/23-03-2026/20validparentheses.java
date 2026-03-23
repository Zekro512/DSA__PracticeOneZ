/*
Platform: LeetCode
Problem: Valid Parentheses
Date: 22-03-2026

Problem:
Check if brackets are valid and properly nested.

Approach:
Stack

Idea:
Opening brackets are pushed to stack.
Closing brackets must match the top of the stack.

Steps:
1. Push opening brackets
2. On closing bracket:
   - check stack not empty
   - pop and match
3. If mismatch → false
4. If stack empty at end → true

Time Complexity: O(n)
Space Complexity: O(n)

Pattern:
Stack (LIFO)
*/
import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{

                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
