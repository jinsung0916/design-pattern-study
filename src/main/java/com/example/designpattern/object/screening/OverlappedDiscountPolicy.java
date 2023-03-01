package com.example.designpattern.object.screening;

import java.util.List;

public class OverlappedDiscountPolicy implements DiscountPolicy {

    private List<DiscountPolicy> policies;

    public OverlappedDiscountPolicy(List<DiscountPolicy> policies) {
        this.policies = policies;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return policies.stream()
                .map(it -> it.calculateDiscountAmount(screening))
                .reduce(Money.ZERO, Money::plus);
    }

}
