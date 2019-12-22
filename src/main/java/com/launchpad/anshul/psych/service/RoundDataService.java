package com.launchpad.anshul.psych.service;

import com.launchpad.anshul.psych.model.entity.Round;
import com.launchpad.anshul.psych.repository.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoundDataService {
    @Autowired
    private RoundRepository roundRepository;

    public Round getRoundById(long id) {
        return roundRepository.getOne(id);
    }

    public List<Round> getAllRounds() {
        return roundRepository.findAll();
    }

    public void insertOrUpdateRound(Round player) {
        roundRepository.save(player);
    }

    public void deleteRoundById(long id) {
        roundRepository.deleteById(id);
    }
}
