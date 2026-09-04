package com.sih26043.backend.user.entity;

import com.sih26043.backend.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "student_profiles")
public class StudentProfile extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @Column(nullable = false, length = 1000)
    private String skills;

    @ManyToOne
    @JoinColumn(name = "university_id", nullable = false)
    private UniversityProfile university;
}