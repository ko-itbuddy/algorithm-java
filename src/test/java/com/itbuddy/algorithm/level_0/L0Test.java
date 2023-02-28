package com.itbuddy.algorithm.level_0;



import com.itbuddy.algorithm.challenge.level_0.L0S0001;
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
}
