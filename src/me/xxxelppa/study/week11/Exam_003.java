package me.xxxelppa.study.week11;

public class Exam_003 {
    public static void main(String[] args) {
        System.out.println("========================= START =========================");
        System.out.println("===================== enum 변수 선언 ====================");
        WhiteshipLectureList list;
        System.out.println("================== enum 변수에 값 할당 ==================");
        list = WhiteshipLectureList.SPRING_BOOT;
        System.out.println("=================== enum 변수 값 사용 ===================");
        System.out.println(list + " 수강료는 " + list.getAmount() + "(원) 입니다.");
        System.out.println("========================== END ==========================");
    }
}