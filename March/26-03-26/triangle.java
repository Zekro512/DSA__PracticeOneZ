/*
Platform: LeetCode
Problem: Triangle Minimum Path Sum
Date: 25-03-2026

Problem:
Find minimum path sum from top to bottom.

Approach:
Dynamic Programming (Bottom-Up)

Idea:
Each cell depends on min of two children below.

triangle[i][j] += min(
    triangle[i+1][j],
    triangle[i+1][j+1]
)

Time Complexity: O(n^2)
Space Complexity: O(1)

Pattern:
Dynamic Programming / Grid DP
*/
import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        // Start from second last row
        for(int i = n - 2; i >= 0; i--){

            for(int j = 0; j <= i; j++){

                int down = triangle.get(i + 1).get(j);
                int diagonal = triangle.get(i + 1).get(j + 1);

                int current = triangle.get(i).get(j);

                triangle.get(i).set(j, current + Math.min(down, diagonal));
            }
        }

        return triangle.get(0).get(0);
    }
}
