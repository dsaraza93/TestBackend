package com.gaspi.testbackend.mapper;

import com.gaspi.testbackend.DTO.ArticuloDTO;
import com.gaspi.testbackend.DTO.ArticuloUpdateDTO;
import com.gaspi.testbackend.entity.Articulo;
import org.springframework.stereotype.Component;

@Component
public class ArticuloMapper {

    public ArticuloDTO toDTO(Articulo articulo) {
        ArticuloDTO dto = new ArticuloDTO();
        dto.setId(articulo.getId());
        dto.setNombre(articulo.getNombre());
        dto.setDescripcion(articulo.getDescripcion());
        dto.setPrecio(articulo.getPrecio());
        dto.setModelo(articulo.getModelo());
        return dto;
    }

    public Articulo toEntity(ArticuloDTO dto) {
        Articulo articulo = new Articulo();
        articulo.setId(dto.getId());
        articulo.setNombre(dto.getNombre());
        articulo.setDescripcion(dto.getDescripcion());
        articulo.setPrecio(dto.getPrecio());
        articulo.setModelo(dto.getModelo());
        return articulo;
    }

    public Articulo updateEntity(Articulo articulo, ArticuloUpdateDTO updateDTO) {
        if (updateDTO.getDescripcion() != null && !updateDTO.getDescripcion().isEmpty()) {
            articulo.setDescripcion(updateDTO.getDescripcion());
        }
        if (updateDTO.getModelo() != null && !updateDTO.getModelo().isEmpty()) {
            articulo.setModelo(updateDTO.getModelo());
        }
        return articulo;
    }
}
