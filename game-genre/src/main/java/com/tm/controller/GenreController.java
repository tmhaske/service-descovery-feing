package com.tm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.model.Genre;
import com.tm.service.GenreService;

@RestController
@RequestMapping(path = "/api/v1/genre")
public class GenreController {
	
	private GenreService service;

	public GenreController(GenreService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path = "genre")
	public List<Genre> getAllGenre(){
		return service.getAllGenre();
	}

}
