package me.xxxelppa.study.week03;

public class Exam_012 {
    public static void main(String[] args) {
        /*
         * 가장 기본적인 형태의 switch 문
         */
        System.out.println(switchBasic("a"));   // 1
        System.out.println(switchBasic("e"));   // 3
        
        /*
         * java 12 부터 쉼표(, 콤마)를 사용하여 여러 case 를 한 줄에 나열
         */
        //System.out.println(switchWithMultiCase("d"));   // 3
        //System.out.println(switchWithMultiCase("f"));   // 3
        
        /*
         * java 12 부터 화살표 (arrow ->) 를 사용하여 결과 반환
         * 더 이상 break 키워드를 사용하지 않아도 원하는 결과를 받아볼 수 있음
         * 실행 결과를 바로 변수에 할당
         */
        //System.out.println(switchWithArrow("c"));   // 2
        //System.out.println(switchWithArrow("e"));   // 3
        
        /*
         * java 13 부터 yield 키워드를 사용하여 switch 결과 반환
         */
        //System.out.println(switchWithJava13Yield("a"));   // 1
        //System.out.println(switchWithJava13Yield("e"));   // 3
    }
    
    private static int switchBasic(String str) {
        int result;
        switch (str) {
            case "a":
            case "b":
                result = 1;
                break;
            case "c":
                result = 2;
                break;
            case "d":
            case "e":
            case "f":
                result = 3;
                break;
            default:
                result = -1;
        };
        return result;
    }
    /*
    private static int switchWithMultiCase(String str) {
        int result;
        switch (str) {
            case "a", "b":
                result = 1;
                break;
            case "c":
                result = 2;
                break;
            case "d", "e", "f":
                result = 3;
                break;
            default:
                result = -1;
        };
        return result;
    }
    
    private static int switchWithArrow(String str) {
        int result = switch (str) {
            case "a", "b" -> 1;
            case "c" -> 2;
            case "d", "e", "f" -> 3;
            default -> -1;
        };
        return result;
    }
    
    private static int switchWithJava13Yield(String str) {
        int result = switch (str) {
            case "a", "b":
                yield 1;
            case "c":
                yield 2;
            case "d", "e", "f" : {
                System.out.println("{} 블록을 사용하여 추가 로직을 수행할 수 있다.");
                yield 3;
            }
            default:
                yield -1;
        };
        return result;
    }
     */
}
