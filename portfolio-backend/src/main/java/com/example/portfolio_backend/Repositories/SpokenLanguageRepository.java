package com.example.portfolio_backend.Repositories;

import com.example.portfolio_backend.Models.SpokenLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpokenLanguageRepository  extends JpaRepository<SpokenLanguage, Long> {
}
