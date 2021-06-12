package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidades.Citas;

public interface CitasRepositorio extends CrudRepository<Citas, Long> {

}
