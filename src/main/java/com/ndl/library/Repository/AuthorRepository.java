package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndl.library.Model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
