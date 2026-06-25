//brute fore 

class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        return solve(0, 0, text1, text2);
    }

    private int solve(int i, int j, String s1, String s2) {

        if (i == s1.length() || j == s2.length())
            return 0;

        if (s1.charAt(i) == s2.charAt(j))
            return 1 + solve(i + 1, j + 1, s1, s2);

        return Math.max(
                solve(i + 1, j, s1, s2),
                solve(i, j + 1, s1, s2));
    }
}


Recursive Relation
If


text1[i] == text2[j]
Then


1 + solve(i+1,j+1)
Else


max(
solve(i+1,j),
solve(i,j+1)
)
