package com.example.designpattern.factory_method;

public class WhiteShipFactory extends AbstractShipFactory {

    @Override
    public boolean isValidOrder(OrderShipDto orderShipDto) {
        return true;
    }

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }

}
