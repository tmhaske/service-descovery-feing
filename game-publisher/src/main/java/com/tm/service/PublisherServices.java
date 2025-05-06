package com.tm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tm.model.Publisher;
import com.tm.repository.PublisherRepository;

@Service
public class PublisherServices {

	private PublisherRepository publisherRepository;
	
	public PublisherServices(PublisherRepository repository) {
		this.publisherRepository = repository;
	}
	
	public List<Publisher> getAllPublishers(){
		return publisherRepository.findAll();
	}
	
}
