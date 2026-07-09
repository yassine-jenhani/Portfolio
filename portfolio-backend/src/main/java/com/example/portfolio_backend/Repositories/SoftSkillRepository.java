package com.example.portfolio_backend.Repositories;

import com.example.portfolio_backend.Models.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository<SoftSkill, Long> {
}
