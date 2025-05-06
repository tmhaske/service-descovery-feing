package com.tm.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.client.GameClient;
import com.tm.client.GenreClient;
import com.tm.client.PublisherClient;
import com.tm.dto.GameDTO;
import com.tm.model.Game;
import com.tm.model.Genre;

@Service
public class GameService {

	@Autowired
	private GameClient gameClient;
	@Autowired
	private GenreClient genreClient;
	@Autowired
	private PublisherClient publisherClient;

	public List<GameDTO> getDetails() {

		List<Game> games = gameClient.getGames();
		List<Genre> genre = genreClient.getGenre();

		Map<Long, Genre> genreMap = genre.stream().collect(Collectors.toMap(Genre::getId, Function.identity()));

		List<GameDTO> gameDto = games.parallelStream().map(game -> {
			Genre gen = genreMap.get(game.getGenreId());
			return new GameDTO(game.getId(), gen, game.getGameName());
		}).toList(); 
		return gameDto; 
	}

}
