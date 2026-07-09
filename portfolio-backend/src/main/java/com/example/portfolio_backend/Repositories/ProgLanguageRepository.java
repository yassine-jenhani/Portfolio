package com.example.portfolio_backend.Repositories;

import com.example.portfolio_backend.Models.ProgLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgLanguageRepository extends JpaRepository<ProgLanguage, Long> {
}
