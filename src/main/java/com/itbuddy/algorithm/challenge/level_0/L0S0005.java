package com.itbuddy.algorithm.challenge.level_0;

/**
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120921
 * TITLE : 문자열 밀기
 * COMMENT :
 */

public class L0S0005 {

    public int solution(String A, String B) {
        return B.repeat(3).indexOf(A);
    }

    public int mySolution(String A, String B) {
        int answer = 0;

        for(int i = 0;i<A.length();i++){
            if(A.equals(B)) return answer;
            A = A.charAt(A.length()-1)+A.substring(0,A.length()-1);
            answer++;
        }

        if(answer == A.length()) return -1;

        return answer;
    }
}
