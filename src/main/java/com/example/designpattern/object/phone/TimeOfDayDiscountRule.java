package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
public class TimeOfDayDiscountRule {

    private LocalDateTime from;
    private LocalDateTime to;
    private Duration duration;
    private Money amount;

    public Money calculateCallFee(DateTimeInterval interval) {
        return amount.times(Duration.between(from(interval), to(interval)).dividedBy(duration));
    }

    private LocalDateTime from(DateTimeInterval interval) {
        return interval.getFrom().isAfter(from)
                ? interval.getFrom()
                : from;
    }

    private LocalDateTime to(DateTimeInterval interval) {
        return interval.getTo().isBefore(to)
                ? interval.getTo()
                : to;
    }

}
