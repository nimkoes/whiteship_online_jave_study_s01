package me.xxxelppa.study.week04;

public class QueueUsingListNode {
    ListNode head;
    
    public QueueUsingListNode() {
        head = new ListNode();
    }
    
    public void push(int data) {
        head.add(head, new ListNode(data), head.size());
    }
    
    public int pop() {
        try {
            return head.remove(head, 0).getData();
        } catch (NullPointerException e) {
            return -1;
        }
    }
}