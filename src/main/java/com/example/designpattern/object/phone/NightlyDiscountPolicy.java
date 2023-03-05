package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.time.Duration;

public class NightlyDiscountPolicy extends BaseRatePolicy {

    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration duration;

    public NightlyDiscountPolicy(Money nightlyAmount, Money regularAmount, Duration duration) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.duration = duration;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmount.times(call.getDuration().dividedBy(duration));
        }

        return regularAmount.times(call.getDuration().dividedBy(duration));
    }

}
