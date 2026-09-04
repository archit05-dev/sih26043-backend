package com.sih26043.backend.user.repository;

import com.sih26043.backend.user.entity.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}