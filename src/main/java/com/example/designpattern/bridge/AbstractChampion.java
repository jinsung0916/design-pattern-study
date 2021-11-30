package com.example.designpattern.bridge;

import lombok.AllArgsConstructor;

/*
 * 서로 다른 두 계층 인터페이스 간 브릿지를 두어 계층을 세분화 한다.
 * (Java 에서 다중상속이 불가능한 점을 해결하는 한 방법이 될 수도...?)
 */
@AllArgsConstructor
public abstract class AbstractChampion implements Champion {

    private Skin skin;

    protected abstract String getName();

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.getName());
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q\n", skin.getName(), this.getName());
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W\n", skin.getName(), this.getName());
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E\n", skin.getName(), this.getName());
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R\n", skin.getName(), this.getName());
    }
}
