package com.tm.dto;

import com.tm.model.Genre;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class GameDTO {
	
	private Long id; 
	private Genre genre;
	private String gameName;
	

}
