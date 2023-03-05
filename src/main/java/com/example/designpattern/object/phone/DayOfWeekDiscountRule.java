package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.List;

public class DayOfWeekDiscountRule {

    private List<DayOfWeek> dayOfWeeks;
    private Duration duration;
    private Money amount;

    public DayOfWeekDiscountRule(List<DayOfWeek> dayOfWeeks, Duration duration, Money amount) {
        this.dayOfWeeks = dayOfWeeks;
        this.duration = duration;
        this.amount = amount;
    }

    public Money calculateCallFee(DateTimeInterval interval) {
        if (isNotExists(interval)) {
            return Money.ZERO;
        }

        return amount.times(interval.duration().dividedBy(duration));
    }

    private boolean isNotExists(DateTimeInterval interval) {
        return !dayOfWeeks.contains(interval.getFrom().getDayOfWeek());
    }

}
