package me.xxxelppa.study.week04;

import java.util.Objects;

public class ListNode {
    
    private int data;
    private ListNode next;
    private boolean isHead;
    
    public int getData() {
        return this.data;
    }
    
    /*
     * 기본 생성자를 사용할 경우 head 노드 생성
     */
    public ListNode() {
        this.data = 0;
        this.next = null;
        this.isHead = true;
    }
    
    /*
     * 생성자에 데이터가 넘어오면 데이터 노드 생성
     */
    public ListNode(int data) {
        this.data = data;
        this.next = null;
        this.isHead = false;
    }
    
    /*
     * 크기를 반환하는 메소드
     */
    public int size() {
        if(!this.isHead) {
            System.out.println("head 노드가 아니므로 길이를 반환할 수 없습니다.");
            return -1;
        }
        
        int size = 0;
        ListNode ln = this;
        while(ln.next != null) {
            ++size;
            ln = ln.next;
        }
        
        return size;
    }
    
    /*
     * 입력 받은 position 에 따라 후속 작업이 가능한지 검사
     * 1. head 노드가 아닌 경우 false 반환
     * 2. position 이 음수인 경우 false 반환
     * 3. position 이 현재 리스트의 전체 길이를 넘길 경우 false 반환
     */
    private boolean basicValidation(int pos) {
        if(!this.isHead) {
            System.out.println("head 노드를 기준으로만 처리할 수 있습니다.");
            return false;
        }
        
        if(pos < 0) {
            System.out.println("음수 위치에서 값을 처리할 수 없습니다.");
            return false;
        }
        
        if(size() < pos) {
            System.out.println("현재 리스트 길이보다 큰 위치에서 처리할 수 없습니다.");
            return false;
        }
        
        return true;
    }
    
    /*
     * 요소를 추가하는 add 메소드
     * null 을 반환하면 추가할 수 없음을 의미
     * 성공적으로 추가 해을 경우 추가한 노드를 반환
     */
    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if(!basicValidation(position)) {
            return null;
        }
        
        while(--position >= 0) {
            head = head.next;
        }
        
        nodeToAdd.next = head.next;
        head.next = nodeToAdd;
        
        return nodeToAdd;
    }
    
    /*
     * 특정 위치의 노드를 삭제
     * null을 반환하면 삭제할 수 없음을 의미
     * 성공적으로 삭제한 경우 삭제한 노드를 반환
     */
    public ListNode remove(ListNode head, int positionToRemove) {
        if(!basicValidation(positionToRemove)) {
            return null;
        }
        
        if(size() == 0) {
            System.out.println("데이터가 없습니다.");
            return null;
        }
        
        ListNode deleteNode = head.next, beforeNode = head;
        
        while(--positionToRemove > 0) {
            beforeNode = deleteNode;
            deleteNode = deleteNode.next;
        }
        
        beforeNode.next = deleteNode.next;
        
        return deleteNode;
    }
    
    /*
     * 노드가 포함되어 있는지 확인
     */
    public boolean contains(ListNode head, ListNode nodeTocheck) {
        boolean result = false;
        
        if(!head.isHead) {
            System.out.println("head 노드가 아니면 작업을 처리할 수 없습니다.");
            return result;
        }
        
        do {
            if(head.equals(nodeTocheck)) {
                result = true;
                break;
            }
            head = head.next;
        } while(head != null);
        
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return this.data == listNode.data && Objects.equals(this.next, listNode.next);
    }
}