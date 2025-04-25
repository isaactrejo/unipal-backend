package com.example.demo.controller;

import com.example.demo.config.DataLoader;
import com.example.demo.model.Enrollment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("http://localhost:4200") // now allows angular app?
public class EnrollmentController {
    private final DataLoader dataLoader;
    public EnrollmentController(DataLoader dataLoader) { this.dataLoader = dataLoader; }

    @GetMapping("/enrollments")
    public List<Enrollment> getByUser(@RequestParam String userId) {
        return dataLoader.enrollments.stream()
                .filter(e -> e.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}
