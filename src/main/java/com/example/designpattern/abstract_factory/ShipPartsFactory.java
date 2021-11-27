package com.example.designpattern.abstract_factory;

/*
 * What is the basic difference between the Factory and Abstract Factory Design Patterns?
 * https://stackoverflow.com/questions/1001767/what-is-the-basic-difference-between-the-factory-and-abstract-factory-design-pat
 * */
public interface ShipPartsFactory {

    Wheel createWheel();

    Anchor createAnchor();

}
