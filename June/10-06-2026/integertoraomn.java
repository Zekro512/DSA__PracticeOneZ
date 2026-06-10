# LeetCode 12 - Integer to Roman

## Problem Link
https://leetcode.com/problems/integer-to-roman/

## Difficulty
Medium

## Approach Used
Greedy Approach

## Intuition

Roman numerals are built using the largest possible symbol first.

For example:

1994

= 1000 + 900 + 90 + 4

= M + CM + XC + IV

= MCMXCIV

The idea is to always choose the largest Roman numeral value that is less than or equal to the current number and subtract it from the number.

---

## Algorithm

1. Create an array of integer values in descending order.
2. Create a corresponding array of Roman symbols.
3. Traverse both arrays.
4. While the current value is less than or equal to the number:
   - Append the Roman symbol.
   - Subtract the value from the number.
5. Return the final string.

---

## Java Solution

```java
class Solution {

    public String intToRoman(int num) {

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] roman = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < values.length; i++) {

            while(num >= values[i]) {
                ans.append(roman[i]);
                num -= values[i];
            }
        }

        return ans.toString();
    }
}
