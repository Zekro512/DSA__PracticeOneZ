/*
Platform: LeetCode
Problem: Middle of the Linked List
Date: 12-04-2026

Problem:
Find middle node of linked list.
If even length → return second middle.

Approach:
Fast & Slow Pointer

Idea:
Fast moves 2 steps, slow moves 1 step.
When fast reaches end → slow is at middle.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Two Pointer / Fast & Slow Pointer
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
