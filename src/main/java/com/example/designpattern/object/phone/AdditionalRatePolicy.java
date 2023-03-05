package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

public abstract class AdditionalRatePolicy implements RatePolicy {

    private RatePolicy basePolicy;

    @Override
    public Money calculateFee(Phone phone) {
        Money fee = basePolicy.calculateFee(phone);
        return afterCalculated(fee);
    }

    protected abstract Money afterCalculated(Money fee);

}
