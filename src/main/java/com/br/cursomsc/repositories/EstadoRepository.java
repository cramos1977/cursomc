package com.br.cursomsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cursomsc.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer > {

}
