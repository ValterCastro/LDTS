package com.aor.numbers;

import java.util.Arrays;
import java.util.List;


public class GenericListDeduplicatorTest implements GenericListDeduplicator {

    @Override
    public List<Integer> deduplicate(List<Integer>l){
        return Arrays.asList(1,2,4);
    }
}
