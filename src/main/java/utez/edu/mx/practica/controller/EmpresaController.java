package utez.edu.mx.practica.controller;

import utez.edu.mx.practica.dto.EmpresaDTO;
import utez.edu.mx.practica.model.Empresa;
import utez.edu.mx.practica.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping("/registrar")
    public ResponseEntity<Empresa> registrarEmpresa(@RequestBody EmpresaDTO empresaDTO) {
        Empresa nuevaEmpresa = new Empresa();
        nuevaEmpresa.setNombre(empresaDTO.getNombre());
        nuevaEmpresa.setDireccion(empresaDTO.getDireccion());

        Empresa empresaGuardada = empresaService.registrarEmpresa(nuevaEmpresa);
        return ResponseEntity.ok(empresaGuardada);
    }


    // Endpoint para obtener una empresa por UUID
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerEmpresa(@PathVariable UUID id) {
        Optional<Empresa> empresa = empresaService.obtenerEmpresaPorId(id);

        return empresa.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
