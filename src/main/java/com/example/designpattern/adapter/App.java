package com.example.designpattern.adapter;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        UserDetails authenticated = loginHandler.login("username", "password");
        System.out.println(authenticated);
    }

}
