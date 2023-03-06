package com.itbuddy.algorithm.challenge.level_0;

import java.util.Arrays;

/**
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120924
 * TITLE : 다음에 올 숫자
 */

public class L0S0002 {
    public int solution(int[] common) {
        int answer = 0;
        System.out.println(Arrays.toString(common));
        boolean isDeungCha = isDeungCha(common);
        System.out.println(isDeungCha);
        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[common.length-1] + (common[common.length-1] -  common[common.length-2]);
        }else{
            answer = common[common.length-1] * (common[common.length-1] /  common[common.length-2]);
        }
        return answer;
    }

    boolean isDeungCha(int[] common) {
        System.out.println(String.format("common.length: %d",common.length));
        for (int i = 1; i < common.length-1; i++) {
            System.out.println(String.format("%d:%d %d:%d",i, i-1, i+1, i));
            if (common[i] - common[i-1] == common[i+1] - common[i]) return false;
        }
        return true;
    }
}
