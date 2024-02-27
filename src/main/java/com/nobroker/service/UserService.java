package com.nobroker.service;

import com.nobroker.paylode.UserDto;
import org.springframework.stereotype.Service;

public interface UserService {
    public long createUser(UserDto userDto);
}
