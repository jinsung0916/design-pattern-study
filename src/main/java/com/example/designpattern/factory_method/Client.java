package com.example.designpattern.factory_method;

public class Client {

    public static void main(String[] args) {

        Ship whiteShip = new WhiteShipFactory().orderShip(new OrderShipDto());
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip(new OrderShipDto());
        System.out.println(blackShip);
    }
}
