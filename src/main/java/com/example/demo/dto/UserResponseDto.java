package com.example.demo.dto;

import com.example.demo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponseDto {
    private String username;

    public static UserResponseDto userResponseDto(User user){
        return new UserResponseDto(user.getUsername());
    }

}
