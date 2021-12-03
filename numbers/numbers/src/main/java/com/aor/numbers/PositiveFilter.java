package com.aor.numbers;

public class PositiveFilter implements GenericListFilterer {
    @Override
    public boolean accept(Integer number) {
        return number > 0;
    }
}
