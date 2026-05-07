package com.java.api.springbootrestapi.dto;

public record UserDto(Long id, String firstName, String lastName, String email, String password, String role, String address, String city, String state, String zipCode, String country, String phoneNumber, String imageUrl, String status, String createdAt, String updatedAt) {
}
