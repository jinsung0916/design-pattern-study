package com.example.designpattern.object.screening;

public class PercentDiscountPolicy extends AbstractDiscountPolicy {

    private double percent;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }

}
