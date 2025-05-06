package com.tm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tm.model.Game;
import com.tm.repository.GameRepository;

@Service
public class GameService {

	private GameRepository gameRepository; 
	
	public GameService(GameRepository repository) {
		this.gameRepository = repository;
	}
	
	public List<Game> getAllGames(){
		return gameRepository.findAll();
	}
	
}
