package me.xxxelppa.study.week11;

import java.util.EnumMap;
import java.util.Map;

public class Exam_008 {
    public static void main(String[] args) {
        EnumMap<WhiteshipLectureList, String> enumMap = new EnumMap<>(WhiteshipLectureList.class);
        
        enumMap.put(WhiteshipLectureList.REST_API, "수강하고싶다.");
        enumMap.put(WhiteshipLectureList.SPRING_FRAMEWORK_CORE, "재미있게 수강 했다.");
    
        for (Map.Entry<WhiteshipLectureList, String> entry : enumMap.entrySet()) {
            System.out.println(entry.getKey().getKorDesc() + " :: " + entry.getValue());
        }
    }
}