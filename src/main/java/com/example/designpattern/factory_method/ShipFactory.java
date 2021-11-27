package com.example.designpattern.factory_method;

/* Factory 객체 안에 여러 가지 인스턴스를 생성하는 로직이 섞여 있을 경우, 클래스 응집도가 떨어진다.
   Factory 자체를 추상화해서 인스턴스 생성을 담당하는 구현체를 별도로 구현하는 방식으로 해결한다. */
public interface ShipFactory {

    Ship orderShip(OrderShipDto orderShipDto);

}
