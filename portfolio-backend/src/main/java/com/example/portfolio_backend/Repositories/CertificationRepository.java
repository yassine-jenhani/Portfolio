package com.example.portfolio_backend.Repositories;

import com.example.portfolio_backend.Models.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certification,Long> {
}
