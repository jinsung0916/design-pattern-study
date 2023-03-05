package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.time.Duration;

public class FeePerDutaion {

    private Money fee;
    private Duration duration;

    public FeePerDutaion(Money fee, Duration duration) {
        this.fee = fee;
        this.duration = duration;
    }

    public Money calculateFee(DateTimeInterval interval) {
        return fee.times(interval.duration().dividedBy(duration));
    }

}
