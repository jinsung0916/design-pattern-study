package com.example.designpattern.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameServiceProxy implements GameService {

    private final GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }

}
