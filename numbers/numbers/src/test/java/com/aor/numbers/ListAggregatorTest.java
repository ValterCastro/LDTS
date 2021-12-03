package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListAggregatorTest {
    List<Integer>list = new ArrayList<>();
    ListAggregator aggregator = new ListAggregator();;

    @BeforeEach
    public void helper(){
        list = Arrays.asList(1, 2, 4, 2, 5);
    }

    @Test
    public void max_bug_7263() {
        List<Integer> maxlist = Arrays.asList(-1,-4,-5);
        int max = aggregator.max(maxlist);
        aggregator.max(maxlist);

        Assertions.assertEquals(-1, max);
    }

    @Test
    public void max_bug_8726(){

        /*
        GenericListDeduplicator genericListDeduplicator = new GenericListDeduplicatorTest();
        int distinct = aggregator.distinct(Arrays.asList(1,2,4,2), genericListDeduplicator);

        Assertions.assertEquals(3, distinct);
        */

        GenericListDeduplicator deduplicator  = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));
        int distinct = aggregator.distinct(Arrays.asList(1,2,4,2), deduplicator);

        Assertions.assertEquals(3, distinct);


    }


    @Test
    public void sum() {
        //List<Integer> list = Arrays.asList(1,2,4,2,5);




        //int sum = aggregator.sum(aggregator.helper(Arrays.asList(1,2,4,2,5)));
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        //List<Integer> list = Arrays.asList(1,2,4,2,5);

        //ListAggregator aggregator = new ListAggregator();

        //int max = aggregator.max(aggregator.helper(Arrays.asList(1,2,4,2,5)));
        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        //List<Integer> list = Arrays.asList(1,2,4,2,5);

        //ListAggregator aggregator = new ListAggregator();
        //int min = aggregator.min(aggregator.helper(Arrays.asList(1,2,4,2,5)));
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    /*
    @Test
    public void distinct() {
        //List<Integer> list = Arrays.asList(1,2,4,2,5);

        //ListAggregator aggregator = new ListAggregator();
        //int distinct = aggregator.distinct(aggregator.helper(Arrays.asList(1,2,4,2,5)));
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }
    */

}
