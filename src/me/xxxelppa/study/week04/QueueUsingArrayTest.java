package me.xxxelppa.study.week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingArrayTest {
    
    QueueUsingArray queueUsingArray;
    
    @BeforeEach
    public void before() {
        queueUsingArray = new QueueUsingArray();
    
        queueUsingArray.push(10);
        queueUsingArray.push(20);
        queueUsingArray.push(30);
        queueUsingArray.push(40);
        queueUsingArray.push(50);
        queueUsingArray.push(60);
        queueUsingArray.push(70);
        queueUsingArray.push(80);
        queueUsingArray.push(90);
        
    }
    
    @Test
    public void pushTest() {
        assertEquals(9, queueUsingArray.size());
        
        queueUsingArray.push(100);
        queueUsingArray.push(110);
        queueUsingArray.push(120);
        
        // 기본 크기 10을 초과해도 자동으로 확장하여 데이터 입력이 가능
        assertEquals(12, queueUsingArray.size());
    }
    
    @Test
    public void popTest() {
        // 들어있는 데이터 전부 소모
        for(int i = 0; i < 9; ++i) {
            queueUsingArray.pop();
        }
        
        // 더이상 데이터가 없는데 pop 을 시도하면 -1을 반환
        assertEquals(0, queueUsingArray.size());
        assertEquals(-1, queueUsingArray.pop());
    }
    
}