package com.example.designpattern.abstract_factory;

public class WhiteSheepPartsFactory implements ShipPartsFactory {
    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }
}
