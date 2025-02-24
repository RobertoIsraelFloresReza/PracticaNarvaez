package utez.edu.mx.practica.dto;

public class EmpresaDTO {
    private String nombre;
    private String direccion;

    // Constructor vacío (obligatorio para Spring)
    public EmpresaDTO() {}

    // Constructor con parámetros
    public EmpresaDTO(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y setters
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
