package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndl.library.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
