package com.is4ii4s.controlepontoacesso.controller;

import com.is4ii4s.controlepontoacesso.model.CategoriaUsuario;
import com.is4ii4s.controlepontoacesso.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")

public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.saveCategoria(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaList() {
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getCategoriaByID(@PathVariable("idCategoria") Long idCategoria) throws Exception{
        return ResponseEntity.ok(categoriaUsuarioService.getById(idCategoria).orElseThrow(() -> new Exception("Categoria não encontrada.")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.updateCategoria(categoriaUsuario);
    }

    @DeleteMapping ("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> deleteCategoriaByID(@PathVariable("idCategoria") Long idCategoria) {
        try {
            categoriaUsuarioService.deleteCategoria(idCategoria);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();

    }

}
