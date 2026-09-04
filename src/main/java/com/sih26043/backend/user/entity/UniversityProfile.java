package com.sih26043.backend.user.entity;

import com.sih26043.backend.common.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "university_profiles")
public class UniversityProfile extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String institutionName;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    private List<Department> departments = new ArrayList<>();
}