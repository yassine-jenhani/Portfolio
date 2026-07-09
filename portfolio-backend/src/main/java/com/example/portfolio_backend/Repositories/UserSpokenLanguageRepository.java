package com.example.portfolio_backend.Repositories;

import com.example.portfolio_backend.Models.UserSpokenLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSpokenLanguageRepository extends JpaRepository<UserSpokenLanguage, Long> {
}
