package com.example.designpattern.adapter;

public class LoginHandler {

    private UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public UserDetails login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (isEqual(userDetails.getPassword(), password)) {
            return userDetails;
        } else {
            throw new RuntimeException("Login failed.");
        }
    }

    private boolean isEqual(String password1, String password2) {
        if (password1 == null) return false;
        return password1.equals(password2);
    }
}
