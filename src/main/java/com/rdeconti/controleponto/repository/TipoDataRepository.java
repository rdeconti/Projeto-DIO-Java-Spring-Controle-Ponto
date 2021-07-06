package com.is4ii4s.controlepontoacesso.repository;

import com.is4ii4s.controlepontoacesso.model.TipoData;
import com.is4ii4s.controlepontoacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}