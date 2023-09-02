package com.codingjx.blogservice.service;

import com.codingjx.blogservice.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
