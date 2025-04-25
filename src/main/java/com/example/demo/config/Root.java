package com.example.demo.config;

import com.example.demo.model.User;
import com.example.demo.model.Course;
import com.example.demo.model.Submission;
import com.example.demo.model.Enrollment;
import com.example.demo.model.Assignment;
import java.util.List;

public class Root {
    private List<User>       users;
    private List<Course>     courses;
    private List<Assignment> assignments;
    private List<Enrollment> enrollments;
    private List<Submission> submissions;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }
}
