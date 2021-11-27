package com.example.designpattern.factory_method;

import com.example.designpattern.abstract_factory.Anchor;
import com.example.designpattern.abstract_factory.Wheel;

public class WhiteShip implements Ship {

    @Override
    public void setWheel(Wheel wheel) {

    }

    @Override
    public void setAnchor(Anchor wheel) {

    }

    @Override
    public String toString() {
        return "This is whiteShip!";
    }

}
