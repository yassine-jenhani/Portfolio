package com.example.portfolio_backend.Repositories;

import com.example.portfolio_backend.Models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository  extends JpaRepository<Experience,Long> {
}
