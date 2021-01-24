package me.xxxelppa.study.week11;

public class Exam_005 {
    public static void main(String[] args) {
        String exists_in_enum = "THE_JAVA_JAVA_8";
        String not_exists_in_enum = "THE_JAVA_JAVA_5";
        
        WhiteshipLectureList myList_1 = WhiteshipLectureList.valueOf(exists_in_enum);
        System.out.println(myList_1.getKorDesc());
        
        try {
            WhiteshipLectureList myList_2 = WhiteshipLectureList.valueOf(not_exists_in_enum);
            System.out.println(myList_2.getKorDesc());
        } catch (IllegalArgumentException e) {
            System.out.println("존재하지 않는 상수를 사용하면 IllegalArgumentException 예외를 발생합니다.");
        }
    }
}