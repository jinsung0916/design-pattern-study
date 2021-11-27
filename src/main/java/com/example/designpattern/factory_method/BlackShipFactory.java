package com.example.designpattern.factory_method;

public class BlackShipFactory extends AbstractShipFactory {
    @Override
    public boolean isValidOrder(OrderShipDto orderShipDto) {
        return true;
    }

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
