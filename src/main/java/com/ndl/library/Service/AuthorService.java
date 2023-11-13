package com.ndl.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ndl.library.Model.Author;
import com.ndl.library.Repository.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Author findAuthorById(int id) {
		Optional<Author> author = authorRepository.findById(id);
		return author.get();
	}

	public void createAuthor(Author author) {
		authorRepository.save(author);
	}

	public void updateAuthor(Author author) {
		authorRepository.save(author);
	}

	public void deleteAuthor(int id) {
		authorRepository.deleteById(id);
	}
}
