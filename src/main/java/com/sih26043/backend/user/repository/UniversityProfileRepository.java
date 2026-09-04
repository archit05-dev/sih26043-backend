package com.sih26043.backend.user.repository;

import com.sih26043.backend.user.entity.UniversityProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityProfileRepository extends JpaRepository<UniversityProfile, Long> {
}