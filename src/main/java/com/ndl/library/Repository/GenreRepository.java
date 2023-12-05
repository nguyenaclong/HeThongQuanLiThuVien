package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndl.library.Model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
