package com.example.designpattern.object.phone;

import java.util.Collections;
import java.util.List;

public class FixedFeeRule implements FeeCondition {

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return Collections.singletonList(call.getInterval());
    }

}
