package com.leepro1.designpattern.adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
