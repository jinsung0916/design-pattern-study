package com.example.designpattern.singleton;

// Enum 을 통한 singleton 구현 - reflection, 역직렬화를 통한 singleton 위배 방지
// (단점: eager initialization, 상속 불가능)
public enum SettingsEnum {

    INSTANCE

}
