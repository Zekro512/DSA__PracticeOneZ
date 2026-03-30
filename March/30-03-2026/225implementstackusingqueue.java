/*
Platform: LeetCode
Problem: Implement Stack using Queues
Date: 30-03-2026

Problem:
Implement stack (LIFO) using queue (FIFO).

Approach:
Queue Rotation

Idea:
After pushing element, rotate queue so new element comes to front.

Time Complexity:
push → O(n)
pop → O(1)

Pattern:
Data Structure Simulation
*/
import java.util.*;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {

        q2.offer(x);

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }

        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
