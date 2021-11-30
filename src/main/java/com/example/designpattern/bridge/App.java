package com.example.designpattern.bridge;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KdaSkin());
        Champion poolParty아리 = new 아리(new PoolPartySkin());

        kda아리.move();
        poolParty아리.move();
    }
}
