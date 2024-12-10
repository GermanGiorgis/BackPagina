package com.proyectoCaristia.Caristia.Repositorios;

import com.proyectoCaristia.Caristia.Entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CLienteRepositorio extends JpaRepository<Cliente, Long> {
}
