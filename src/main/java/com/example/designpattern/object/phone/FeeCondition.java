package com.example.designpattern.object.phone;

import java.util.List;

public interface FeeCondition {

    List<DateTimeInterval> findTimeIntervals(Call call);

}
