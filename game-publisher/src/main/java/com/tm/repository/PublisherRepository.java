package com.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tm.model.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long>{

}
