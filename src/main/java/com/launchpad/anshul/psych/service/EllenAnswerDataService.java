package com.launchpad.anshul.psych.service;

import com.launchpad.anshul.psych.model.entity.EllenAnswer;
import com.launchpad.anshul.psych.model.entity.Game;
import com.launchpad.anshul.psych.repository.EllenAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EllenAnswerDataService {
    @Autowired
    private EllenAnswerRepository ellenAnswerRepository;

    public EllenAnswer getEllenAnswerById(long id) {
        return ellenAnswerRepository.getOne(id);
    }

    public List<EllenAnswer> getAllEllenAnswers() {
        return ellenAnswerRepository.findAll();
    }

    public void insertOrUpdateEllenAnswer(EllenAnswer game) {
        ellenAnswerRepository.save(game);
    }

    public void deleteEllenAnswerById(long id) {
        ellenAnswerRepository.deleteById(id);
    }
}
