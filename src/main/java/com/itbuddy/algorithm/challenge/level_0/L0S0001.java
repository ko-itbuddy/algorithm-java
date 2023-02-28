package com.itbuddy.algorithm.challenge.level_0;

/**
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120956
 * TITLE : 옹알이 (1)
 */

public class L0S0001 {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String ba : babbling){
            if(ba.replaceAll("(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))","").equals("")) {
                answer = answer +1;
            }
        }

        return answer;
    }
}
