package com.sih26043.backend.user.repository;

import com.sih26043.backend.user.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}