package com.example.designpattern.flyweight;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();

        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
    }

}
