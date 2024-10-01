package com.gaspi.testbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Articulo {
    @Id
    @Size(max = 10)
    private String id; // Mantener el ID como String, sin autogenerar

    @Size(max = 20)
    private String nombre;

    @Size(max = 200)
    private String descripcion;

    @Column(precision = 10, scale = 2)
    private BigDecimal precio;

    @Size(max = 10)
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
