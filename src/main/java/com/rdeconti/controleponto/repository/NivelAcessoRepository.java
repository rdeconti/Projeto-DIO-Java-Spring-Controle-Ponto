package com.is4ii4s.controlepontoacesso.repository;

import com.is4ii4s.controlepontoacesso.model.JornadaTrabalho;
import com.is4ii4s.controlepontoacesso.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {
}