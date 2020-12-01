package me.xxxelppa.study.week04;

public class ListNodeStack {
    ListNode head;
    
    public ListNodeStack() {
        head = new ListNode();
    }
    
    public ListNodeStack(int data) {
        this();
        head.add(head, new ListNode(data), head.size());
    }
    
    public void push(int data) {
        head.add(head, new ListNode(data), head.size());
    }
    
    /*
     * 반환할 데이터가 없는 경우 -1 반환
     */
    public int pop() {
        try {
            return head.remove(head, head.size()).getData();
        } catch (NullPointerException e) {
            return -1;
        }
    }
}