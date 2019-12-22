package com.launchpad.anshul.psych.service;

import com.launchpad.anshul.psych.model.entity.Player;
import com.launchpad.anshul.psych.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlayerDataService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player getPlayerById(long id) {
        return playerRepository.getOne(id);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public void insertOrUpdatePlayer(Player player) {
        playerRepository.save(player);
    }

    public void deletePlayerById(long id) {
        playerRepository.deleteById(id);
    }
}
