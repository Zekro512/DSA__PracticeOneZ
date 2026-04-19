/*
Platform: LeetCode
Problem: Merge Two Sorted Lists
Date: 14-04-2026

Problem:
Merge two sorted linked lists into one sorted list.

Approach:
Iterative (Dummy Node + Two Pointer)

Idea:
Compare nodes and attach smaller one.
Use dummy node to simplify.

Time Complexity: O(n + m)
Space Complexity: O(1)

Pattern:
Linked List Merge / Two Pointer
*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null){

            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        
        if(list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }

        return dummy.next;
    }
}
