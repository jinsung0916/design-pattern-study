package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

public class FreeRatePolicy implements RatePolicy {

    @Override
    public Money calculateFee(Phone phone) {
        return Money.ZERO;
    }

}
