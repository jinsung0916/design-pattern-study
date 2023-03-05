package com.example.designpattern.object.phone;

import com.example.designpattern.object.screening.Money;

import java.util.ArrayList;
import java.util.List;

public class Phone {

    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }

}
