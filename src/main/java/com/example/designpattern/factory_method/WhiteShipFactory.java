package com.example.designpattern.factory_method;

import com.example.designpattern.abstract_factory.ShipPartsFactory;

public class WhiteShipFactory extends AbstractShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        super();
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public boolean isValidOrder(OrderShipDto orderShipDto) {
        return true;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setWheel(shipPartsFactory.createWheel());
        ship.setAnchor(shipPartsFactory.createAnchor());
        return ship;
    }

}
