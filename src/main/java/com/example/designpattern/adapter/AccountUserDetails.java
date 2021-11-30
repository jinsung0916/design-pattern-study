package com.example.designpattern.adapter;

/*
 * Account & UserDetails 를 연결하는 Adapter 클래스
 */
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getUsername();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }

    @Override
    public String toString() {
        return this.account.toString();
    }
}
