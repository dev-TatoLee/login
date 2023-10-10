package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RefreshToken {
    @Id
    @Column(name= "rt_key")
    private String key;

    @Column(name="rt_value")
    private String value;

    public RefreshToken updateValue(String token) {
        this.value = token;
        return this;
    }
}
