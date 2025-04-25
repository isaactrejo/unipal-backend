package com.example.demo.config;

import com.example.demo.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader {
    public List<User>       users;
    public List<Course>     courses;
    public List<Assignment> assignments;
    public List<Enrollment> enrollments;
    public List<Submission> submissions;

    @PostConstruct
    public void load() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = getClass().getResourceAsStream("/db.json");
        // now we make goofy ah holder class that matches the root struct of db.json
        Root root = objectMapper.readValue(inputStream, Root.class);
        users       = root.getUsers();
        courses     = root.getCourses();
        assignments = root.getAssignments();
        enrollments = root.getEnrollments();
        submissions = root.getSubmissions();
    }
}
