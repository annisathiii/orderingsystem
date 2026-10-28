package com.example.orderingsystem.controller;

import com.example.orderingsystem.entity.Menu;
import com.example.orderingsystem.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuRepository menuRepository;

    @GetMapping
    public List<Menu> daftarMenu() {
        return menuRepository.findAll();
    }
}
