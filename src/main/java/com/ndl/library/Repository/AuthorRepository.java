package com.ndl.library.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ndl.library.Model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
