package com.tm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.model.Game;
import com.tm.service.GameService;

@RestController
@RequestMapping(path = "/api/v1/game/")
public class GameController {

	private GameService gameService;

	public GameController(GameService service) {
		this.gameService = service;
	}

	@GetMapping(path = "games")
	public List<Game> getAllGames() {
		return gameService.getAllGames();
	}
}
