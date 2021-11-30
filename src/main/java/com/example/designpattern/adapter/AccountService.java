package com.example.designpattern.adapter;

public class AccountService {

    private static String PASSWORD = "password";

    public Account findAccountByUsername(String username) {
        return new Account(username, PASSWORD);
    }

}
