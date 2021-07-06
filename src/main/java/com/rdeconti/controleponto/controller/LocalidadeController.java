package com.is4ii4s.controlepontoacesso.controller;

import com.is4ii4s.controlepontoacesso.model.Localidade;
import com.is4ii4s.controlepontoacesso.model.NivelAcesso;
import com.is4ii4s.controlepontoacesso.service.LocalidadeService;
import com.is4ii4s.controlepontoacesso.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")

public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.saveLocalidade(localidade);
    }

    @GetMapping
    public List<Localidade> getLocalidade() {
        return localidadeService.findAll();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getLocalidadeByID(@PathVariable("idLocalidade") Long idLocalidade) throws Exception{
        return ResponseEntity.ok(localidadeService.getById(idLocalidade).orElseThrow(() -> new Exception("Localidade não encontrada.")));
    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.updateLocalidade(localidade);
    }

    @DeleteMapping ("/{idLocalidade}")
    public ResponseEntity<Localidade> deleteLocalidadeByID(@PathVariable("idLocalidade") Long idLocalidade) {
        try {
            localidadeService.deleteLocalidade(idLocalidade);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Localidade>) ResponseEntity.ok();

    }

}
