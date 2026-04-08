/*
Platform: LeetCode
Problem: Same Tree
Date: 08-04-2026

Problem:
Check if two binary trees are identical.

Approach:
Recursion (DFS)

Idea:
Compare nodes:
1. Both null → true
2. One null → false
3. Values differ → false
4. Recurse on left and right

Time Complexity: O(n)
Space Complexity: O(h)

Pattern:
Tree Traversal / Recursion
*/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;

        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
