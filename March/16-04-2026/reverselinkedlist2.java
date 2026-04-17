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
class Solution{
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
