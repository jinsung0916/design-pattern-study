package com.example.designpattern.proxy;

import lombok.SneakyThrows;

public class DefaultGameService implements GameService {

    @SneakyThrows
    public void startGame() {
        System.out.println("Start game...");
        Thread.sleep(1000);
    }

}
