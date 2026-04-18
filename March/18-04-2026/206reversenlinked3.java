/*
Platform: LeetCode
Problem: Reverse Linked List
Date: 13-04-2026

Problem:
Reverse a singly linked list.

Approach:
Iterative (Pointer Manipulation)

Idea:
Use three pointers:
prev, curr, next
Reverse links one by one.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern:
Linked List / Pointer Reversal
*/
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
