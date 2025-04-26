package com.example.demo.repository;

import com.example.demo.model.Enrollment;
import com.example.demo.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories("com.example.demo.repository")
public interface UserRepository extends JpaRepository<User, String> {
    // you can add custom queries here if needed
}
