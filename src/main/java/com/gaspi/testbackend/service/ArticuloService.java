package com.gaspi.testbackend.service;

import com.gaspi.testbackend.DTO.ArticuloDTO;
import com.gaspi.testbackend.DTO.ArticuloUpdateDTO;
import com.gaspi.testbackend.entity.Articulo;
import com.gaspi.testbackend.mapper.ArticuloMapper;
import com.gaspi.testbackend.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Autowired
    private ArticuloMapper articuloMapper;

    public Optional<ArticuloDTO> obtenerArticuloPorId(String id) {
        return articuloRepository.findById(id).map(articuloMapper::toDTO);
    }

    public ArticuloDTO crearArticulo(ArticuloDTO articuloDTO) {
        Articulo articulo = articuloMapper.toEntity(articuloDTO);
        Articulo articuloGuardado = articuloRepository.save(articulo);
        return articuloMapper.toDTO(articuloGuardado);
    }

    public ArticuloDTO actualizarArticulo(String id, ArticuloUpdateDTO updateDTO) {
        return articuloRepository.findById(id).map(a -> {
            Articulo articuloActualizado = articuloMapper.updateEntity(a, updateDTO);
            articuloRepository.save(articuloActualizado);
            return articuloMapper.toDTO(articuloActualizado);
        }).orElse(null);
    }
}
