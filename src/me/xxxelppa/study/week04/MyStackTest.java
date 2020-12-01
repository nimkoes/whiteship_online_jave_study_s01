package me.xxxelppa.study.week04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    
    MyStack myStack;
    
    @BeforeEach
    public void before() {
        myStack = new MyStack(10);
        for (int i = 20; i < 100; i += 10) myStack.push(i);
    }
    
    @Test
    public void pushTest() {
        // 범위를 초과해서 값을 넣어도 오류가 발생하지 않는다.
        assertDoesNotThrow(() -> myStack.push(999));
        assertDoesNotThrow(() -> myStack.push(888));
        assertDoesNotThrow(() -> myStack.push(777));
        assertDoesNotThrow(() -> myStack.push(666));
    }
    
    @Test
    public void popTest() {
        // 스택의 모든 값을 꺼내서 확인
        for (int i = 90; i > 0; i -= 10) {
            assertEquals(i, myStack.pop());
        }
        
        // 스택이 비어있는 상태에서 pop을 호출하면 -1을 반환한다.
        assertEquals(-1, myStack.pop());
        assertEquals(-1, myStack.pop());
        
    }
}