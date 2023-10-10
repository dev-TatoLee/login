package com.example.demo.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Authority {
    ROLE_USER("ROLE_USER");

    private final String value;
}
