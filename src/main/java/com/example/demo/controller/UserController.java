package com.example.demo.controller;

import com.example.demo.dto.UserResponseDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/studio")
public class UserController {
    private final UserService userService;

    @GetMapping("/my")
    public ResponseEntity<UserResponseDto> getLoginUserInfo(){
        return ResponseEntity.ok(userService.getLoginUserInfo());
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserResponseDto> getUserInfo(@PathVariable String username){
        return ResponseEntity.ok(userService.getUserInfo(username));
    }
}
