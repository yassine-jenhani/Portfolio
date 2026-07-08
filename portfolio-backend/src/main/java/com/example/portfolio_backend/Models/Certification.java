package com.example.portfolio_backend.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String issuer;

    @Column(nullable = false, name = "issue_date")
    private Date issueDate;

    @Column(nullable = true, name = "expiration_date")
    private Date expirationDate;

    @Column(nullable = true, name = "credential_url")
    private String credentialUrl;

    @Column(nullable = true, name = "image_url")
    private String imageUrl;

    @Column(nullable = false)
    private String description;

    // Audit
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
