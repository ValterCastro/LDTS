package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilterer{

    @Override
    public boolean accept(Integer number) {
        return (number % 2 == 0);
    }


}
