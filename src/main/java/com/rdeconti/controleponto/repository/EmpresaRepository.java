package com.is4ii4s.controlepontoacesso.repository;

import com.is4ii4s.controlepontoacesso.model.Empresa;
import com.is4ii4s.controlepontoacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}