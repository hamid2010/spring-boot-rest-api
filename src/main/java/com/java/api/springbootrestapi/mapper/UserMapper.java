package com.java.api.springbootrestapi.mapper;

import com.java.api.springbootrestapi.dto.UserDto;
import com.java.api.springbootrestapi.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user) {
        return new UserDto(user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole(),
                user.getAddress(),
                user.getCity(),
                user.getState(),
                user.getZipCode(),
                user.getCountry(),
                user.getPhoneNumber(),
                user.getImageUrl(),
                user.getStatus(),
                user.getCreatedAt(),
                user.getUpdatedAt());
    }
    public User toEntity(UserDto userDto, User user) {
        return new User(userDto.id(),
                userDto.firstName(),
                userDto.lastName(),
                userDto.email(),
                userDto.password(),
                userDto.role(),
                userDto.address(),
                userDto.city(),
                userDto.state(),
                userDto.zipCode(),
                userDto.country(),
                userDto.phoneNumber(),
                userDto.imageUrl(),
                userDto.status(),
                userDto.createdAt(),
                userDto.updatedAt());


    }
}
