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
@EqualsAndHashCode
@ToString
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = false, length = 100,  nullable = false)
    private String school;

    @Column(length = 100,  nullable = false)
    private String degree;

    private String city;

    private String country;

    private String grade;

    @Column(length = 100,  nullable = false)
    private String field;

    @Column(nullable = false, name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String logo;

    // Audit
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
