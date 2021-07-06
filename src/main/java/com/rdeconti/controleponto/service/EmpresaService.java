package com.is4ii4s.controlepontoacesso.service;

import com.is4ii4s.controlepontoacesso.model.Empresa;
import com.is4ii4s.controlepontoacesso.model.JornadaTrabalho;
import com.is4ii4s.controlepontoacesso.repository.EmpresaRepository;
import com.is4ii4s.controlepontoacesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa saveEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long idEmpresa) {
        return empresaRepository.findById(idEmpresa);
    }

    public Empresa updateEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteEmpresa(Long idEmpresa) {
        empresaRepository.deleteById(idEmpresa);
    }
}
