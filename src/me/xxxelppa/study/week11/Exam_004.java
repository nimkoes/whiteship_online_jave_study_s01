package me.xxxelppa.study.week11;

public class Exam_004 {
    public static void main(String[] args) {
        WhiteshipLectureList[] lists = WhiteshipLectureList.values();
        for(WhiteshipLectureList list : lists) {
            System.out.println(list.toString() + " (" + list.getAmount() + " 원) => " + list.getKorDesc());
        }
    }
}