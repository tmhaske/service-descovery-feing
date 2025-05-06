package com.tm.fallback;

import java.util.Collections;
import java.util.List;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.tm.client.GenreClient;
import com.tm.model.Genre;

@Component
public class GenreFallbackFactory implements FallbackFactory<GenreClient> {

	@Override
	public GenreClient create(Throwable cause) {
		return new GenreClient() {

			public List<Genre> getGenre() {
				System.err.println("Genre service failed: " + cause.getMessage());
				return Collections.singletonList(new Genre(0L, "Fallback Genre"));
			}
		};
	}

}
