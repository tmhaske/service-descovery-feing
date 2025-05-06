package com.tm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.model.Publisher;
import com.tm.service.PublisherServices;

@RestController
@RequestMapping(path = "/api/v1/publisher")
public class PublisherController {

	private PublisherServices publisherServices;

	public PublisherController(PublisherServices service) {
		this.publisherServices = service;
	}

	@GetMapping(path = "publishers")
	public List<Publisher> getAllPublishers() {
		return publisherServices.getAllPublishers();
	}
}
