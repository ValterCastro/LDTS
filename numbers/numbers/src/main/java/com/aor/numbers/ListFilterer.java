package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListFilterer {
    GenericListFilterer fil;
    public ListFilterer(GenericListFilterer filter){
        fil = filter;
    }
    public List<Integer> filter(List<Integer> list){
        List<Integer> mutable_list = new ArrayList<>();
        for(Integer i : list){
            if(fil.accept(i)){
                mutable_list.add(i);
            }
        }
        return mutable_list;
    }
}
