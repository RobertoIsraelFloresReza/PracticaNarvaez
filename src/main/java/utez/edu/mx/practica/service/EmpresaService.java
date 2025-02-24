package utez.edu.mx.practica.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import utez.edu.mx.practica.model.Empresa;
import utez.edu.mx.practica.repository.EmpresaRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class EmpresaService {
    private static final Logger logger = LogManager.getLogger(EmpresaService.class);
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa registrarEmpresa(Empresa empresa) {
        logger.info("Registrando nueva empresa: {}", empresa.getNombre());
        Empresa empresaGuardada = empresaRepository.save(empresa);
        logger.debug("Empresa guardada con UUID: {}", empresaGuardada.getUuid());
        return empresaGuardada;
    }

    public Optional<Empresa> obtenerEmpresaPorId(UUID uuid) {
        logger.info("Buscando empresa con UUID: {}", uuid);
        Optional<Empresa> empresa = empresaRepository.findById(uuid);
        if (empresa.isPresent()) {
            logger.info("Empresa encontrada: {}", empresa.get().getNombre());
        } else {
            logger.warn("No se encontró ninguna empresa con UUID: {}", uuid);
        }
        return empresa;
    }
}
