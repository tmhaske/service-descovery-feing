package com.tm.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tm.fallback.GenreFallbackFactory;
import com.tm.model.Genre;

@FeignClient(name = "GAMES-GENRE",path = "/api/v1/genre/" , fallbackFactory = GenreFallbackFactory.class)
public interface GenreClient {
	
	@GetMapping(path = "genre")
	public List<Genre> getGenre();
}
