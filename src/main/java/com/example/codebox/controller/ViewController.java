package com.example.codebox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/courses")
    public String showCoursesPage() {
        return "courses";
    }

    @GetMapping("/course-details")
    public String showCourseDetailsPage() {
        return "course-details";
    }

    @GetMapping("/profile")
    public String showProfilePage() {
        return "profile";
    }

    @GetMapping("/auth")
    public String showAuthPage() {
        return "auth";
    }

    @GetMapping("/signin")
    public String showSigninPage() {
        return "signin";
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        return "signup";
    }
}
