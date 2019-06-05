package com.gmail.shilovich.stas.jd.service.impl;

import com.gmail.shilovich.stas.jd.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.transaction.Transactional;

public class UserServiceImpl implements UserService, UserDetailsService {


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s)  {
        return null;
    }
}
