package com.example.demo.service;

import com.example.demo.dto.UserResponseDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserResponseDto getUserInfo(String username) {
        return userRepository.findByUsername(username)
                .map(UserResponseDto::userResponseDto)
                .orElseThrow(() -> new RuntimeException("사용자 정보가 없습니다"));
    }

    @Transactional(readOnly = true)
    public UserResponseDto getLoginUserInfo() {
        return userRepository.findById(SecurityUtil.getCurrentUsername())
                .map(UserResponseDto::userResponseDto)
                .orElseThrow(() -> new RuntimeException("로그인 사용자 정보가 없습니다"));
    }
}
