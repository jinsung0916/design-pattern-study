package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

public abstract class BaseRatePolicy implements RatePolicy {

    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    protected abstract Money calculateCallFee(Call call);

}
