package com.is4ii4s.controlepontoacesso.controller;

import com.is4ii4s.controlepontoacesso.model.Calendario;
import com.is4ii4s.controlepontoacesso.model.Movimentacao;
import com.is4ii4s.controlepontoacesso.service.CalendarioService;
import com.is4ii4s.controlepontoacesso.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")

public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.saveMovimentacao(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getMovimentacaoList() {
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getMovimentacaoByID(@PathVariable("idMovimentacao") Long idMovimentacao) throws Exception{
        return ResponseEntity.ok(movimentacaoService.getById(idMovimentacao).orElseThrow(() -> new Exception("Movimentação não encontrada.")));
    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.updateMovimentacao(movimentacao);
    }

    @DeleteMapping ("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> deleteMovimentacaoByID(@PathVariable("idMovimentacao") Long idMovimentacao) {
        try {
            movimentacaoService.deleteMovimentacao(idMovimentacao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();

    }

}
