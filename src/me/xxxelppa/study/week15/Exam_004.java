package me.xxxelppa.study.week15;

public class Exam_004 {
    public static void main(String[] args) {
        
        // 1. 작성 가능한 모든 내용을 생략 없이 작성한 경우
        LambdaTest_001 myTest_01 = (String param) -> {
            System.out.println(param);
        };
        
        // 2. 매개변수의 타입을 생략한 경우
        LambdaTest_001 myTest_02 = (param) -> {
            System.out.println(param);
        };
        
        // 3. 매개변수가 한개여서 소괄호를 생략한 경우
        LambdaTest_001 myTest_03 = param -> {
            System.out.println(param);
        };
        
        // 4. 실행 코드가 한 줄이어서 중괄호를 생략한 경우
        LambdaTest_001 myTest_04 = (String param) -> System.out.println(param);
        
        // 5. 매개변수가 한개이고 실행 코드가 한 줄이어서 생략 가능한 모든것을 생략한 경우
        LambdaTest_001 myTest_05 = param -> System.out.println(param);
        
        // 6. 반환값이 있는 경우 return 키워드 사용하는 경우
        LambdaTest_002 myTest_06 = (n1, n2) -> {
            System.out.println("6. 반환값이 있는 경우 return 키워드 사용하는 경우");
            return n1 + n2;
        };
    
        // 7. 실행 코드가 반환 코드만 존재하는 경우 키워드와 중괄호 생략한 경우
        LambdaTest_002 myTest_07 = (n1, n2) -> n1 + n2;
        
        // 8. 매개변수가 없어서 소괄호를 생략할 수 없는 경우
        LambdaTest_003 myTest_08 = () -> System.out.println("8. 매개변수가 없어서 소괄호를 생략할 수 없는 경우");
        
        myTest_01.printString("1. 작성 가능한 모든 내용을 생략 없이 작성한 경우");
        myTest_02.printString("2. 매개변수의 타입을 생략한 경우");
        myTest_03.printString("3. 매개변수가 한개여서 소괄호를 생략한 경우");
        myTest_04.printString("4. 실행 코드가 한 줄이어서 중괄호를 생략한 경우");
        myTest_05.printString("5. 매개변수가 한개이고 실행 코드가 한 줄이어서 생략 가능한 모든것을 생략한 경우");
        
        System.out.println();
        System.out.println(myTest_06.add(10, 20));
        System.out.println(myTest_07.add(20, 30));
    
        myTest_08.noArgs();
    }
}

@FunctionalInterface
interface LambdaTest_001 {
    void printString(String str);
}

@FunctionalInterface
interface LambdaTest_002 {
    int add(int num1, int num2);
}

@FunctionalInterface
interface LambdaTest_003 {
    void noArgs();
}