package com.example.portfolio_backend.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "first_name")
    private String firstname;

    @Column(nullable = false, name = "last_name")
    private String lastname;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "address")
    private String address;

    private Date age;

    @Column(nullable = false, unique = true, name = "linkedin_url")
    private String linkedInUrl;

    private String image;

    @Column(nullable = false, unique = true, name = "github_url")
    private String githubUrl;

    @Column(nullable = true, unique = true, name = "gitlab_url")
    private String gitlabUrl;

    private String bio;

    // Audit
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Project> projects = new ArrayList<>();

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Education> educations;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL)
    private List<Certification> certifications;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL)
    private List<Experience> experiences;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL)
    private List<UserSpokenLanguage> spokenLanguages;

    @ManyToMany
    @JoinTable(
            name = "user_skill",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<SoftSkill> skills;
}
