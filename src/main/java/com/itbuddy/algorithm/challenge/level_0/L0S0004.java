package com.itbuddy.algorithm.challenge.level_0;

import java.util.Arrays;

/**
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120922
 * TITLE : 종이 자르기
 * COMMENT :
 */

public class L0S0004 {
    public int solution(int M, int N) {
        // M-1 + M*(N-1) -> M*N-1
        return M*N-1;
    }
}
