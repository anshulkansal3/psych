package com.launchpad.anshul.psych.service;

import com.launchpad.anshul.psych.model.entity.Question;
import com.launchpad.anshul.psych.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionDataService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question getQuestionById(long id) {
        return questionRepository.getOne(id);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public void insertOrUpdateQuestion(Question player) {
        questionRepository.save(player);
    }

    public void deleteQuestionById(long id) {
        questionRepository.deleteById(id);
    }
}
