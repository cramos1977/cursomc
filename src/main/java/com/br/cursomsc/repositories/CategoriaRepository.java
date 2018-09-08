package com.br.cursomsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cursomsc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer > {

}
