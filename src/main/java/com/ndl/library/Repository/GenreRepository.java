package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndl.library.Model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
