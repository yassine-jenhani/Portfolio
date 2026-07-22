package com.example.portfolio_backend.Config;

import com.example.portfolio_backend.Models.User;
import com.example.portfolio_backend.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;


@Configuration
@RequiredArgsConstructor
@EnableJpaAuditing
public class DataInitializer {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Bean
    CommandLineRunner initAdmin() {
        return args -> {

            if (userRepository.count() == 0) {

                User admin = User.builder()
                        .firstname("Yassine")
                        .lastname("Jenhani")
                        .email("your@email.com")
                        .password(passwordEncoder.encode("yourPassword"))
                        .createdAt(LocalDateTime.now())
                        .build();
                userRepository.save(admin);
            }
        };
    }
}

