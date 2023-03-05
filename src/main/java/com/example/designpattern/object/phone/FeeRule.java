package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

public class FeeRule {

    private FeeCondition feeCondition;
    private FeePerDutaion feePerDutaion;

    public FeeRule(FeeCondition feeCondition, FeePerDutaion feePerDutaion) {
        this.feeCondition = feeCondition;
        this.feePerDutaion = feePerDutaion;
    }

    public Money calculateFee(Call call) {
        return feeCondition.findTimeIntervals(call)
                .stream()
                .map(it -> feePerDutaion.calculateFee(it))
                .reduce(Money.ZERO, Money::plus);
    }

}
