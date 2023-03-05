package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.time.Duration;

public class FixedFeePolicy extends BaseRatePolicy {

    private Money amount;
    private Duration seconds;

    public FixedFeePolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().dividedBy(seconds));
    }

}
