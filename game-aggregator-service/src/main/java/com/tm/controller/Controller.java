package com.tm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.dto.GameDTO;
import com.tm.service.GameService;

@RestController
@RequestMapping(path = "/api/v1/game")
public class Controller {
	
	@Autowired
	private GameService service;
	
	@GetMapping("details")
	public List<GameDTO> getDetails(){
		return service.getDetails();
	}

}
