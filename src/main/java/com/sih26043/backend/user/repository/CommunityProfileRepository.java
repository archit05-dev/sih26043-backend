package com.sih26043.backend.user.repository;

import com.sih26043.backend.user.entity.CommunityProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityProfileRepository extends JpaRepository<CommunityProfile, Long> {
}