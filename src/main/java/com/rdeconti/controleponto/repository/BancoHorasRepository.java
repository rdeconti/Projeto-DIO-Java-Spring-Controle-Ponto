package com.is4ii4s.controlepontoacesso.repository;

import com.is4ii4s.controlepontoacesso.model.BancoHoras;
import com.is4ii4s.controlepontoacesso.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}