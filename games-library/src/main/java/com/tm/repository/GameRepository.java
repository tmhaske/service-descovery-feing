package com.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tm.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
