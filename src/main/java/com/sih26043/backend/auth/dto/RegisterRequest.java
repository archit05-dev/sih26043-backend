package com.sih26043.backend.auth.dto;

import com.sih26043.backend.common.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank
    private String fullName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private Role role;

    // Student
    private Long universityId;
    private String skills;

    // Community
    private String organizationName;

    // Industry
    private String companyName;

    // University
    private String institutionName;
}