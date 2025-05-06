package com.tm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tm.model.Genre;
import com.tm.repository.GenreRepository;

@Service
public class GenreService {

	private GenreRepository genreRepository;

	public GenreService(GenreRepository genreRepository) {
		super();
		this.genreRepository = genreRepository;
	}
	
	public List<Genre> getAllGenre(){
		return genreRepository.findAll();
	}
}
