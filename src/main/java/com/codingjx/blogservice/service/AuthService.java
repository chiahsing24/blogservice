package com.codingjx.blogservice.service;

import com.codingjx.blogservice.payload.LoginDto;
import com.codingjx.blogservice.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
