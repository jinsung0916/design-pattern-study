package com.example.designpattern.object.screening;

import java.time.Duration;

public class MovieFactory {

    public static Movie createAvatarMovie() {
        return new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new NullDiscountPolicy()
        );
    }

}
