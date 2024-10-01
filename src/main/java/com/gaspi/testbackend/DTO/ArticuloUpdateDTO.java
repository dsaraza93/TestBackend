package com.gaspi.testbackend.DTO;

import jakarta.validation.constraints.Size;

public class ArticuloUpdateDTO {
    @Size(max = 200)
    private String descripcion;

    @Size(max = 10)
    private String modelo;

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
