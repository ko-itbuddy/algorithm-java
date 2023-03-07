package com.itbuddy.algorithm.level_0;



import com.itbuddy.algorithm.challenge.level_0.L0S0001;
import com.itbuddy.algorithm.challenge.level_0.L0S0002;
import com.itbuddy.algorithm.challenge.level_0.L0S0003;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class L0Test {


    @Test()
    public void l1s0001Test() {
        L0S0001 l0S0001 = new L0S0001();
        //given
        //when
        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(1, l0S0001.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"})),
                () -> Assertions.assertEquals(3, l0S0001.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})),
                () -> Assertions.assertEquals(0, l0S0001.solution(new String[]{"yeye"})),
                () -> Assertions.assertEquals(0, l0S0001.solution(new String[]{"ayaaya", "yeye", "woowoo", "mama"}))
        );
    }

    @Test()
    public void l1s0002Test() {
        L0S0002 l0S0002 = new L0S0002();
        //given
        //when
        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(5, l0S0002.solution(new int[]{1, 2, 3, 4})),
                () -> Assertions.assertEquals(16, l0S0002.solution(new int[]{2, 4, 8}))
        );
    }

    @Test()
    public void l1s0003Test() {
        L0S0003 l0S0003 = new L0S0003();
        //given
        //when
        //then
        Assertions.assertAll(
                () -> Assertions.assertArrayEquals(new int[]{3, 4, 5}, l0S0003.solution(3, 12)),
                () -> Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, l0S0003.solution(5, 15)),
                () -> Assertions.assertArrayEquals(new int[]{2, 3, 4, 5}, l0S0003.solution(4, 14)),
                () -> Assertions.assertArrayEquals(new int[]{-1, 0, 1, 2, 3}, l0S0003.solution(5, 5))
        );
    }

//    @Test()
//    public void l1s0003Test() {
//        L0S0003 l0S0003 = new L0S0003();
//        //given
//        //when
//        //then
//        Assertions.assertAll(
//                () -> Assertions.assertEquals(5, l0S0003.solution()),
//                () -> Assertions.assertEquals(16, l0S0003.solution())
//        );
//    }
}
