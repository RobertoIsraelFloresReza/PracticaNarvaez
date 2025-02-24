package utez.edu.mx.practica.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    public Empresa() {}

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Cambiar getId() a getUuid()
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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
