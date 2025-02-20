package utez.edu.mx.practica.service;

import org.springframework.stereotype.Service;
import utez.edu.mx.practica.model.Empresa;
import utez.edu.mx.practica.repository.EmpresaRepository;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa registrarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Optional<Empresa> obtenerEmpresaPorId(UUID id) {
        return empresaRepository.findById(id);
    }
}
