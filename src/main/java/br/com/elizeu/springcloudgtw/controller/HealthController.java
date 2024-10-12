package br.com.elizeu.springcloudgtw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HealthController {
    @GetMapping("/health")
    public String healthCheck() {
        return "{\"status\": \"Servidor funcionando\"}"; // Retorna um JSON
    }
}
