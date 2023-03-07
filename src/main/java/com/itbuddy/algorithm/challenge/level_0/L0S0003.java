package com.itbuddy.algorithm.challenge.level_0;

import java.util.Arrays;

/**
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 * TITLE : 연속된 수의 합
 * COMMENT : 등차 수열의 첫번째 항을 구하는 공식을 이용하여 풀이.
 */

public class L0S0003 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int a1 = ((2*total/num) -num +1 )/2;


        for(int i =0; i<num;i++){
            answer[i] =  a1+i;
        }

        return answer;
    }

    public int[] mySolution(int num, int total) {
        int[] answer = new int[num];

        int tmpSum = 0;
        int startNum = total/2;
        while(total != tmpSum){
            tmpSum = 0;
            startNum--;
            for(int i =0; i<num;i++){
                tmpSum += startNum+i;
            }
        }


        for(int i =0; i<num;i++){
            answer[i] =  startNum+i;
        }

        return answer;
    }

    public static void main(String[] args) {
        L0S0003 l0S0003 = new L0S0003();
        System.out.println(Arrays.toString(l0S0003.solution(5, 5)));

    }
}
