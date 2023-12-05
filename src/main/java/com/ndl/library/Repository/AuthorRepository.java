package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndl.library.Model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
