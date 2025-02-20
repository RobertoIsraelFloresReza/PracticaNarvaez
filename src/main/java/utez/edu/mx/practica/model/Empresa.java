package utez.edu.mx.practica.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    // Constructor vacío obligatorio para JPA
    public Empresa() {}

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
