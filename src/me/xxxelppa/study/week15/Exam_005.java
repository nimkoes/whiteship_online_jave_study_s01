package me.xxxelppa.study.week15;

public class Exam_005 {
    public void testMethod(final String myFinalString_01, String myString_01) {
        final String myFinalString_02 = "myFinalString_02";
        String myString_02 = "myString_02";
        
        class VariableCaptureTest {
            // final 명시하지 않은 경우 멤버 필드로 복사
            // String myString_01
            // String myString_02
            void print() {
                // final 명시한 경우 지역 변수로 복사
                // String myFinalString_01
                // String myFinalString_02
                System.out.println(myFinalString_01 + " :: " + myFinalString_02);
                System.out.println(myString_01 + " :: " + myString_02);
            }
        }
        
        new VariableCaptureTest().print();
    }
    
    public static void main(String[] args) {
        Exam_005 exam_005 = new Exam_005();
        exam_005.testMethod("myFinalString_01", "myString_01");
    }
}