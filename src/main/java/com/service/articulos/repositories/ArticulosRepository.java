package com.service.articulos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.articulos.models.Articulos;

public interface ArticulosRepository extends JpaRepository<Articulos, Long> {

}
