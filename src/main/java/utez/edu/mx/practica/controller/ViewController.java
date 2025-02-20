package utez.edu.mx.practica.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Value("${spring.profiles.active:default}")
    private String activeProfile;

    @GetMapping("/")
    public String showView(Model model) {
        // Determinar la carpeta según el perfil activo
        String folder = activeProfile != null ? activeProfile : "default";
        return folder + "/index"; // Retorna la vista correspondiente
    }
}