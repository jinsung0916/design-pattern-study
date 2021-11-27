package com.example.designpattern.factory_method;

import com.example.designpattern.abstract_factory.Anchor;
import com.example.designpattern.abstract_factory.Wheel;

public interface Ship {

    void setWheel(Wheel wheel);

    void setAnchor(Anchor wheel);
}
