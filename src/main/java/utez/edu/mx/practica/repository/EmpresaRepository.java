package utez.edu.mx.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utez.edu.mx.practica.model.Empresa;
import java.util.UUID;

public interface EmpresaRepository extends JpaRepository<Empresa, UUID> {
}
