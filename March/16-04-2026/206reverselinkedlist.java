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
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int i = list.size() - 1;
        while(temp!=null){
            temp.val = list.get(i--);
            temp =  temp.next;
        }
        return head;
    }
}
