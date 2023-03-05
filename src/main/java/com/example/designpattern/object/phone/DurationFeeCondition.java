package com.example.designpattern.object.phone;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class DurationFeeCondition implements FeeCondition {

    private Duration from;
    private Duration to;

    public DurationFeeCondition(Duration from, Duration to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        if (call.getInterval().duration().compareTo(from) < 0) {
            return Collections.emptyList();
        }

        return List.of(
                DateTimeInterval.of(
                        call.getFrom().plus(from),
                        call.getInterval().duration().compareTo(to) > 0 ?
                                call.getFrom().plus(to) :
                                call.getTo()
                )
        );
    }

}
