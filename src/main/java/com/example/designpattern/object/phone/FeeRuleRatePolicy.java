package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.util.List;

public class FeeRuleRatePolicy implements RatePolicy {

    private List<FeeRule> rules;

    public FeeRuleRatePolicy(List<FeeRule> rules) {
        this.rules = rules;
    }

    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            for (FeeRule rule : rules) {
                result = result.plus(rule.calculateFee(call));
            }
        }

        return result;
    }

}
