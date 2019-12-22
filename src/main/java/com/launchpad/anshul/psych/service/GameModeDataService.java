package com.launchpad.anshul.psych.service;

import com.launchpad.anshul.psych.model.entity.GameMode;
import com.launchpad.anshul.psych.repository.GameModeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameModeDataService {

    @Autowired
    private GameModeRepository gameModeRepository;

    public GameMode getGameModeById(long id) {
        return gameModeRepository.getOne(id);
    }

    public List<GameMode> getAllGameModes() {
        return gameModeRepository.findAll();
    }

    public void insertOrUpdateGameMode(GameMode gameMode) {
        gameModeRepository.save(gameMode);
    }

    public void deleteGameModeById(long id) {
        gameModeRepository.deleteById(id);
    }
}
