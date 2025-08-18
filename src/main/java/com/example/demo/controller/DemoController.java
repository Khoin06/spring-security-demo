package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "Trang chủ - public";
    }

    @GetMapping("/user/profile")
    public String profile() {
        return "Thông tin USER hoặc ADMIN";
    }

    @GetMapping("/admin/dashboard")
    public String dashboard() {
        return "Trang ADMIN";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/method-secured")
    public String methodSecured() {
        return "Chỉ ADMIN mới gọi được";
    }
}
