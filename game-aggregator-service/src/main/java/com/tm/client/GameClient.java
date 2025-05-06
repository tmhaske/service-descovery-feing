package com.tm.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tm.model.Game;

@FeignClient(name = "GAMES-LIBRARY", path = "/api/v1/game/" )
public interface GameClient {
	
	@GetMapping(path = "games")
	public List<Game> getGames();
}
