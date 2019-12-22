package com.launchpad.anshul.psych.service;

import com.launchpad.anshul.psych.model.entity.Game;
import com.launchpad.anshul.psych.repository.GameRepository;
import com.launchpad.anshul.psych.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameDataService {

    @Autowired
    private GameRepository gameRepository;

    public Game getGameById(long id) {
        return gameRepository.getOne(id);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public void insertOrUpdateGame(Game game) {
        gameRepository.save(game);
    }

    public void deleteGameById(long id) {
        gameRepository.deleteById(id);
    }
}
