package com.example.portfolio_backend.Repositories;

import com.example.portfolio_backend.Models.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long> {
}
