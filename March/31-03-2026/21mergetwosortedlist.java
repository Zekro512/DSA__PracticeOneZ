/*
Platform: LeetCode
Problem: Merge Two Sorted Lists
Date: 31-03-2026

Problem:
Merge two sorted linked lists into one sorted list.

Approach:
Two Pointer with Dummy Node

Idea:
Compare nodes and attach smaller one to result list.

Time Complexity: O(n + m)
Space Complexity: O(1)

Pattern:
Linked List / Two Pointer
*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }

            ptr = ptr.next;
        }

        // attach remaining nodes
        if(list1 != null){
            ptr.next = list1;
        } else {
            ptr.next = list2;
        }

        return dummy.next;
    }
}
