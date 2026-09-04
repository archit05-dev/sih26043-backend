package com.sih26043.backend.user.repository;

import com.sih26043.backend.user.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}