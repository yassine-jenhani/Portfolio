package com.example.portfolio_backend.Models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relationships
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Experience information
    @Column(nullable = false)
    private String company;

    @Column(nullable = false)
    private String position;

    private String city;

    private String country;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String responsibilities;

    private String projectUrl;

    private String repositoryUrl;

    private String documentation;

    private String companyLogo;

    private String companyWebsite;

    private LocalDate startDate;

    private LocalDate endDate;

    @Column(nullable = false)
    private boolean currentJob;

    @Column(columnDefinition = "TEXT")
    private String achievements;

    @Column(columnDefinition = "TEXT")
    private String companyDescription;

    private String industry;

    private String coverImage;

    private String projectName;

    private String color;

    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;

    // Audit
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // Technologies
    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "experience_technology",
            joinColumns = @JoinColumn(name = "experience_id"),
            inverseJoinColumns = @JoinColumn(name = "technology_id")
    )
    private Set<Technology> technologies = new HashSet<>();

    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "experience_framework",
            joinColumns = @JoinColumn(name = "experience_id"),
            inverseJoinColumns = @JoinColumn(name = "framework_id")
    )
    private Set<Framework> frameworks = new HashSet<>();

    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "experience_language",
            joinColumns = @JoinColumn(name = "experience_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private Set<ProgLanguage> programmingLanguages = new HashSet<>();
}