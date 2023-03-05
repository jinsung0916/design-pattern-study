package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);

}
