package com.ecodeup.biblioteca.biblioteca.repository;

import com.ecodeup.biblioteca.biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface AutorRepository extends JpaRepository <Autor, Integer> {
}
