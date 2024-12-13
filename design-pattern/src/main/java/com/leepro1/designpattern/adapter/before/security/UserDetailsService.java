package com.leepro1.designpattern.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
