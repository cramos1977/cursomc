package com.br.cursomsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cursomsc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer > {

}
