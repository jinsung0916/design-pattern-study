package com.example.designpattern.factory_method;

public abstract class AbstractShipFactory implements ShipFactory {

    @Override
    public Ship orderShip(OrderShipDto orderShipDto) {
        if (isValidOrder(orderShipDto)) {
            return createShip();
        } else {
            throw new IllegalArgumentException();
        }
    }

    protected abstract boolean isValidOrder(OrderShipDto orderShipDto);

    protected abstract Ship createShip();

}
