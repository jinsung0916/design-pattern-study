package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.util.List;

public class TimeOfDayDiscountPolicy extends BaseRatePolicy {

    private List<TimeOfDayDiscountRule> rules;

    @Override
    protected Money calculateCallFee(Call call) {
        Money result = Money.ZERO;

        for (DateTimeInterval interval : call.splitByDay()) {
            for (TimeOfDayDiscountRule each : rules) {
                result = result.plus(each.calculateCallFee(interval));
            }
        }

        return result;
    }

}
