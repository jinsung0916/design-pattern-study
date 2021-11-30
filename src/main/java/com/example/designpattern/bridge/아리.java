package com.example.designpattern.bridge;

public class 아리 extends AbstractChampion {

    private static String NAME = "아리";

    public 아리(Skin skin) {
        super(skin);
    }

    @Override
    protected String getName() {
        return NAME;
    }

}
