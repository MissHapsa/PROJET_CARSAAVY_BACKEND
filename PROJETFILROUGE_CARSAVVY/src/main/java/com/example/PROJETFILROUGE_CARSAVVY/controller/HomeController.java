package com.example.PROJETFILROUGE_CARSAVVY.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public String home() {

        return "<h1>BIENVENUE SUR LA PAGE HOME DU GARAGE " +
                "CARSAAVY METZ " +
                "</h1>";
    }

}