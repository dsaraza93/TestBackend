package com.gaspi.testbackend.controller;

import com.gaspi.testbackend.DTO.ArticuloDTO;
import com.gaspi.testbackend.DTO.ArticuloUpdateDTO;
import com.gaspi.testbackend.service.ArticuloService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @Operation(summary = "Obtener un artículo por su ID", description = "Devuelve un artículo basado en el ID proporcionado.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artículo encontrado"),
            @ApiResponse(responseCode = "404", description = "Artículo no encontrado")
    })
    @GetMapping("/{id}")
    public ResponseEntity<ArticuloDTO> obtenerArticulo(@PathVariable String id) {
        Optional<ArticuloDTO> articuloDTO = articuloService.obtenerArticuloPorId(id);
        return articuloDTO.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Crear un nuevo artículo", description = "Permite crear un nuevo artículo con los detalles proporcionados.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artículo creado con éxito"),
            @ApiResponse(responseCode = "400", description = "Datos de entrada inválidos")
    })
    @PostMapping
    public ResponseEntity<ArticuloDTO> crearArticulo(@Valid @RequestBody ArticuloDTO articuloDTO) {
        ArticuloDTO nuevoArticuloDTO = articuloService.crearArticulo(articuloDTO);
        return ResponseEntity.ok(nuevoArticuloDTO);
    }

    @Operation(summary = "Actualizar un artículo existente", description = "Actualiza los detalles de un artículo basado en el ID proporcionado.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artículo actualizado con éxito"),
            @ApiResponse(responseCode = "404", description = "Artículo no encontrado"),
            @ApiResponse(responseCode = "400", description = "Datos de entrada inválidos")
    })
    @PutMapping("/{id}")
    public ResponseEntity<ArticuloDTO> actualizarArticulo(@PathVariable String id, @Valid @RequestBody ArticuloUpdateDTO updateDTO) {
        ArticuloDTO actualizado = articuloService.actualizarArticulo(id, updateDTO);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
