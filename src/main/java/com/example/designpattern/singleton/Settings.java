package com.example.designpattern.singleton;

public class Settings {

    // 멀티스레드 대응 2.이른 초기화(eager initialization)
//    private final static Settings INSTANCE = new Settings();

    private static volatile Settings instance;

    private Settings() {
    }

    // 멀티스레드 대응 4. static inner class 사용 (스레드 동기화 + lazy initialization)
//    private static class SettingsHolder {
//        private static final Settings INSTANCE = new Settings();
//    }
//    public static Settings getInstance() {
//        return SettingsHolder.INSTANCE;
//    }

    // 멀티스레드 대응 1.synchronized 키워드 사용
//    public static synchronized Settings getInstance() {
    public static Settings getInstance() {
        // 멀티스레드 대응 3. double checked locking
        if (instance != null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

}
