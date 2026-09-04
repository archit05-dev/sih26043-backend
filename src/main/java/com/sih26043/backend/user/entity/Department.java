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
@Table(name = "departments")
public class Department extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "university_id", nullable = false)
    private UniversityProfile university;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Faculty> facultyMembers = new ArrayList<>();
}