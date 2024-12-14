package com.leepro1.designpattern.adapter.after;

import com.leepro1.designpattern.adapter.after.security.LoginHandler;
import com.leepro1.designpattern.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("tester", "tester");
        System.out.println(login);
    }
}
