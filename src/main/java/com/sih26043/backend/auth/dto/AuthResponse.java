package com.sih26043.backend.auth.dto;

import com.sih26043.backend.common.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AuthResponse {

    private String token;

    private Long userId;

    private String fullName;

    private String email;

    private Role role;
}