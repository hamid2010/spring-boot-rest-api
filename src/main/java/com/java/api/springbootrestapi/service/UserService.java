package com.java.api.springbootrestapi.service;

import com.java.api.springbootrestapi.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long id);
    UserDto updateUser(UserDto userDto);
    void deleteUser(Long id);

    List<UserDto> getAllUsers();
}
