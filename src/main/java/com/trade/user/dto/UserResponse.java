package com.trade.user.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

import com.trade.user.entity.Role;

@Data
@Builder
public class UserResponse {

    private Long id;
    private String username;
    private String email;
    private String password;
    private Role role;
    private Boolean active;
    private LocalDateTime createdAt;
}
