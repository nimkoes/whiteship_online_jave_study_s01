package me.xxxelppa.study.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
    
    @Test
    public void addTest() {
        ListNode headNode = new ListNode();
        ListNode dataNode = new ListNode(10);
        ListNode newDataNode = new ListNode(20);
    
        // head 노드를 참조하지 않으면 데이터 추가를 할 수 없고 시도할 경우 null 을 반환
        assertNull(dataNode.add(dataNode, new ListNode(20), 0));
        
        // head 노드를 참조하면 데이터를 추가할 수 있음
        assertNotNull(headNode.add(headNode, dataNode, 0));
        
        // head 노드에 데이터 노드가 성공적으로 추가되면 추가한 노드를 반환
        assertEquals(newDataNode, headNode.add(headNode, newDataNode, 1));
        
        // 범위 밖의 위치에 값 추가 시도시 null 반환
        assertNull(headNode.add(headNode, new ListNode(40), 4));
        assertNull(headNode.add(headNode, new ListNode(40), -1));
    }
    
    @Test
    public void removeTest() {
        ListNode headNode = new ListNode();
        
        // 삭제 할 데이터 세팅
        for(int i = 1; i < 5; ++i) {
            headNode.add(headNode, new ListNode(i * 10), (i-1));
        }
    
        // 성공적으로  노드를 삭제하면, 삭제된 노드를 반환
        assertEquals(20, headNode.remove(headNode, 2).getData());
    
    
        // 범위 밖의 위치 노드 삭제 시도시 null 반환
        assertNull(headNode.remove(headNode, 4));
        assertNull(headNode.remove(headNode, -1));
    }
    
    @Test
    public void containsTest() {
        ListNode headNode = new ListNode();
        ListNode containCheckNode = new ListNode(40);
        
        headNode.add(headNode, new ListNode(10), 0);
        headNode.add(headNode, new ListNode(20), 1);
        headNode.add(headNode, new ListNode(30), 2);
        headNode.add(headNode, containCheckNode, 3);
    
        assertTrue(headNode.contains(headNode, containCheckNode));
        assertFalse(headNode.contains(headNode, new ListNode(99)));
    }
}