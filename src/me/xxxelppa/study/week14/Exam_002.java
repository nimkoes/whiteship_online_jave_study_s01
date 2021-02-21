package me.xxxelppa.study.week14;

import java.util.ArrayList;
import java.util.List;

public class Exam_002 {
    public static void main(String[] args) {
        List without_generic = new ArrayList();
        without_generic.add("제네릭을 사용하지 않은 로타입 리스트");
        
        List<String> with_generic = new ArrayList<>();
        with_generic.add("제네릭을 사용한 리스트");
        
        /*
            객체를 생성할 때 아래와 같이 구체적인 타입을 작성 해야 하지만 생략 가능하다.
            List<String> with_generic = new ArrayList<String>();
            
            이렇게 제네릭을 사용할 때 구체적인 타입 생략이 가능한 것을 다이아몬드 연산자 라고도 한다.
         */
        
        
        // 출력
        String without_generic_String = (String)without_generic.get(0);  // 타입 캐스팅이 필요하다.
        String with_generic_String = with_generic.get(0);                // 타입 캐스팅이 필요하지 않다.
    }
}