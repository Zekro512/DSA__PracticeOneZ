/*
Platform: LeetCode
Problem: 7. Reverse Integer
Date: 09-03-2026

Problem:
Given a signed 32-bit integer x, return the integer formed by reversing its digits.

If reversing x causes the value to go outside the signed 32-bit integer range
[-2^31, 2^31 - 1], return 0.

Example:

Input: x = 123
Output: 321

Input: x = -123
Output: -321

Input: x = 120
Output: 21

Approach:
Digit Extraction using Modulus and Division

Idea:
To reverse an integer, we repeatedly extract the last digit of the number
and append it to a new reversed number.

We perform three operations in each iteration:

1. Extract the last digit using modulus operator (%)
2. Append the digit to the reversed number
3. Remove the last digit from the original number using division (/)

Variables used:
rev → stores the reversed number
digit → stores the last digit of the current number

Overflow Handling:
Since Java int ranges between:

Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE = 2147483647

Before multiplying rev by 10, we check whether the operation will cause overflow.

If:
rev > Integer.MAX_VALUE / 10
or
rev < Integer.MIN_VALUE / 10

then the reversed number would exceed the valid integer range,
so we return 0.

Steps:
1. Initialize rev = 0
2. While x != 0
3. Extract last digit using digit = x % 10
4. Check overflow condition
5. Update rev = rev * 10 + digit
6. Remove last digit using x = x / 10
7. Repeat until x becomes 0
8. Return rev

Example Dry Run:

x = 123

Iteration 1
digit = 3
rev = 3
x = 12

Iteration 2
digit = 2
rev = 32
x = 1

Iteration 3
digit = 1
rev = 321
x = 0

Output = 321

Time Complexity: O(log10(n))
Reason: Number of iterations equals the number of digits in the integer.

Space Complexity: O(1)
Reason: Only a few variables are used, no extra data structures.

Pattern:
Digit Manipulation / Math
*/

class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int digit = x % 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;

            x = x / 10;
        }
        

        return rev;
    }
}

//trid to optimise the solution as well
