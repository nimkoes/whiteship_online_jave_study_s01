package me.xxxelppa.study.week04;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Homework_001 {
    private static final int ISSUE_COUNT = 18;
    
    public static void main(String[] args) throws IOException {
        GitHub github = new GitHubBuilder().withOAuthToken("cff7bbb1d0631e1301d65ef617a6be410d5eb10b").build();
        GHRepository repository = github.getRepository("nimkoes/live-study").getSource();
        GHIssue issue;
        List<GHIssueComment> comments;
        
        HashSet<String> hs;
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (int i = 1; i <= ISSUE_COUNT; ++i) {
            issue = repository.getIssue(i);
            comments = issue.getComments();
            hs = new HashSet<>();
            
            String name = "";
            int size = comments.size();
            for(int j = 0; j < size; ++j) {
                try {
                    name = comments.get(j).getUser().getName();
                    if(name != null && !hs.contains(name)) hm.put(name, hm.getOrDefault(name, 0) + 1);
                } catch (IOException e) {
                    System.out.println("작업 도중 오류가 발생 하였습니다. [" + i + " 주차, 이름 = " + name + "]");
                }
            }
        }
    
        System.out.println("========== 참여율 ==========");
        hm.forEach((s, i) -> System.out.printf("%-20s -> %.2f%%\n", s, (i / (float)ISSUE_COUNT * 100)));
    }
}