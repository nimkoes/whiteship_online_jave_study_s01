package me.xxxelppa.study.week14;

import java.util.ArrayList;
import java.util.List;

public class Exam_008 {
    
    public static <T extends String> List<Integer> printTokenSizeList(List<T> list) {
        List<Integer> result = new ArrayList<>();
        for(T t : list) {
            result.add(t.split(" ").length);
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("가을 하늘 공활한데 높고 구름 없이");
        myList.add("밝은 달은 우리 가슴 일편단심일세");
        myList.add("무궁화 삼천리 화려 강산");
        myList.add("대한사람 대한으로 길이 보전하세");
        
        List<Integer> result = printTokenSizeList(myList);
    
        for(int elem : result) {
            System.out.println(elem);
        }
    }
}