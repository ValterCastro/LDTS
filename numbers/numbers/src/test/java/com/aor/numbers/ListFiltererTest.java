package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {



    @Test public void positiveFilterTest(){
        ListFilterer fil = new ListFilterer(new PositiveFilter());
        List<Integer> positive = fil.filter(Arrays.asList(1,-1,2,4,-4));
        Assertions.assertEquals(3,positive.size());
    }

    @Test public void divisibleFilterTest(){
        ListFilterer fil = new ListFilterer(new DivisibleByFilter());
        List<Integer> divisible = fil.filter(Arrays.asList(1,2,3,4,7));
        Assertions.assertEquals(2,divisible.size());
    }

}
