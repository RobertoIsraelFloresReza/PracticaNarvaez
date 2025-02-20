package utez.edu.mx.practica.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfileController {

    @Value("${app.environment:default}")
    private String environment;

    @GetMapping("/profile")
    public String getActiveProfile() {
        return "Perfil activo: " + environment;
    }

    @GetMapping("/error-test")
    public String errorTest() {
        throw new RuntimeException("Este es un error de prueba");
    }

}