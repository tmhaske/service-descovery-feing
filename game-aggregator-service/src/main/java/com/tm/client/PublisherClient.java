package com.tm.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tm.model.Publisher;

@FeignClient(name = "GAMES-PUBLISHER",path = "/api/v1/publisher/")
public interface PublisherClient {
	
	@GetMapping(path = "publishers")
	public List<Publisher> getPublisher();
}
