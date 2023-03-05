package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.util.List;

public class OverlappedRatePolicy implements RatePolicy {

    private List<RatePolicy> policies;

    @Override
    public Money calculateFee(Phone phone) {
        return policies.stream().map(it -> it.calculateFee(phone)).reduce(Money.ZERO, Money::plus);
    }

}
