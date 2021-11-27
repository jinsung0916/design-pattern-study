package com.example.designpattern.factory_method;

import com.example.designpattern.abstract_factory.WhiteSheepPartsFactory;

public class Client {

    public static void main(String[] args) {

        Ship whiteShip = new WhiteShipFactory(new WhiteSheepPartsFactory()).orderShip(new OrderShipDto());
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip(new OrderShipDto());
        System.out.println(blackShip);
    }
}
