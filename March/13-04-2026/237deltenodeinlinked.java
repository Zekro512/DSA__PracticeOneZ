/*
Platform: LeetCode
Problem: Delete Node in a Linked List
Date: 11-04-2026

Problem:
Delete a node without access to head.

Approach:
Overwrite Node

Idea:
Copy next node value into current node.
Then skip next node.

Time Complexity: O(1)
Space Complexity: O(1)

Pattern:
Linked List / Pointer Manipulation
*/
Class Solution{
  public void DeleteNode(ListNode node){
    node.val=node.next.val;
    node.next=node.next.next;
  }
}
