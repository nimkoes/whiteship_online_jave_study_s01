package me.xxxelppa.study.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {
    
    @Test
    void pushTest() {
        // 길이 0 인 스택 생성
        ListNodeStack emptyListNodeStack = new ListNodeStack();
        emptyListNodeStack.push(10);
        assertEquals(10, emptyListNodeStack.pop());
    
        // 길이 1인 스택 생성
        ListNodeStack listNodeStack = new ListNodeStack(100);
        assertEquals(100, listNodeStack.pop());
    }
    
    @Test
    void popTest() {
        // 길이 1인 스택 생성
        ListNodeStack listNodeStack = new ListNodeStack(1000);
        assertEquals(1000, listNodeStack.pop());
        
        // 길이 0인 상태에서 pop 을 시도하면 -1 을 반환
        assertEquals(-1,listNodeStack.pop());
    }
}