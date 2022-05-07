package com.samara.contatos.repository;

import com.samara.contatos.model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends JpaRepository<Contato, Long>{
    
}
