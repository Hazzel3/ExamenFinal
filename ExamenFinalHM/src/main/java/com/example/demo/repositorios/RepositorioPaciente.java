package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidades.Pacientes;

public interface RepositorioPaciente extends CrudRepository<Pacientes, Long> {

}
