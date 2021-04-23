package me.xxxelppa.study.week04;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Homework_001 {
    private static final int ISSUE_COUNT = 15;
    
    public static void main(String[] args) throws IOException {
        GitHub github = new GitHubBuilder().withOAuthToken("").build();
        GHRepository repository = github.getRepository("nimkoes/live-study").getSource();
        GHIssue issue;
        GHIssueComment ghIssueComment;
        PagedIterable<GHReaction> ghReactions;
        List<GHIssueComment> comments;
        HashMap<String, UserInfo> hm = new HashMap<>();
    
        System.out.println("START !!! ");
        long start = System.currentTimeMillis();
    
        for (int i = 1; i <= ISSUE_COUNT; ++i) {
            System.out.println("issue no : " + i);
            issue = repository.getIssue(i);
            comments = issue.getComments();
            
            String name = "";
            int size = comments.size();
            
            for(int j = 0; j < size; ++j) {
                System.out.println("\tcomment no : " + (j+1));
                try {
                    ghIssueComment = comments.get(j);
                    name = ghIssueComment.getUser().getLogin();
                    
                    if(!hm.containsKey(name)) hm.put(name, new UserInfo(0, 0));
                    
                    ghReactions = ghIssueComment.listReactions();
                    
                    boolean flag = false;
                    for (GHReaction ghReaction : ghReactions) {
                        String temp = ghReaction.toString().toUpperCase();
                        if(temp.contains("PLUS_ONE")) hm.get(name).addThumbsUp();
                        if(temp.contains("HEART")) {
                            hm.get(name).addHeart();
                            flag = true;
                        }
                    }
                    if(flag) hm.get(name).setHeartIndex("" + i);
                } catch (IOException e) {
                    System.out.println("작업 도중 오류가 발생 하였습니다. [" + i + " 주차, 이름 = " + name + "]");
                }
            }
        }
        
        System.out.println("========== 참여율 ==========");
        hm.forEach((s, i) -> System.out.println(i.getHeart() + " \t|\t" + i.getThumbsUp() + " \t|\t" + s + "\t|\t" + i.getWeek()));
//        hm.forEach((s, i) -> System.out.printf("%-20s -> %.2f%%\n", s, (i / (float)ISSUE_COUNT * 100)));
    
        System.out.println(" >>>> " + (System.currentTimeMillis() - start) + " ms");
    }
    
    static class UserInfo {
        int thumbsUp;
        int heart;
        String week;
        
        public UserInfo(int thumbsUp, int heart) {
            this.thumbsUp = thumbsUp;
            this.heart = heart;
            this.week = "";
        }
    
        public void addThumbsUp() { ++this.thumbsUp; }
        public void addHeart() { ++this.heart; }
        public int getThumbsUp() { return thumbsUp; }
        public int getHeart() { return heart; }
        public String getWeek() { return week; }
        
        public void setHeartIndex(String temp) {
            if(!week.equals("")) week += ", ";
            week += temp;
        }
    }
}