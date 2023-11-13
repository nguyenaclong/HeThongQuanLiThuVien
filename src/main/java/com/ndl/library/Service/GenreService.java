package com.ndl.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ndl.library.Model.Genre;
import com.ndl.library.Repository.GenreRepository;

@Service
public class GenreService {
    @Autowired
    private GenreRepository GenreRepository;

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Genre> findAllGenres() {
		return GenreRepository.findAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Genre findGenreById(int id) {
		Optional<Genre> genre = GenreRepository.findById(id);
		return genre.get();
	}

	public void createGenre(Genre genre) {
		GenreRepository.save(genre);
	}

	public void updateGenre(Genre genre) {
		GenreRepository.save(genre);
	}

	public void deleteGenre(int id) {
		GenreRepository.deleteById(id);
	}
}
