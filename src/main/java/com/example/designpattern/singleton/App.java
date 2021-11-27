package com.example.designpattern.singleton;

public class App {

    public static void main(String[] args) {
//        Settings settings1 = Settings.getInstance();
//        Settings settings2 = Settings.getInstance();
//        System.out.println(settings1 == settings2);

        SettingsEnum settings1 = SettingsEnum.INSTANCE;
        SettingsEnum settings2 = SettingsEnum.INSTANCE;
        System.out.println(settings1 == settings2);
    }

}
