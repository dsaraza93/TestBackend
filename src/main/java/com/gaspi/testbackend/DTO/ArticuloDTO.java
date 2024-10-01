package com.gaspi.testbackend.DTO;

import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public class ArticuloDTO {
    @Size(max = 10, message = "El ID no puede tener más de 10 caracteres.")
    private String id;

    @Size(max = 20, message = "El nombre no puede tener más de 20 caracteres.")
    private String nombre;

    @Size(max = 200, message = "La descripción no puede tener más de 200 caracteres.")
    private String descripcion;

    private BigDecimal precio;

    @Size(max = 10, message = "El modelo no puede tener más de 10 caracteres.")
    private String modelo;

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
