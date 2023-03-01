package com.example.designpattern.object.screening;

public class AmountDiscountPolicy extends AbstractDiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }

}
