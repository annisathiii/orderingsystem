package com.example.orderingsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "aplikasi", "Ordering System",
                "status", "berjalan",
                "endpoint_checkout", "POST /api/v1/checkout",
                "daftar_menu", "GET /api/v1/menu"
        );
    }
}
