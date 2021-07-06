package com.is4ii4s.controlepontoacesso.repository;

import com.is4ii4s.controlepontoacesso.model.Calendario;
import com.is4ii4s.controlepontoacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}