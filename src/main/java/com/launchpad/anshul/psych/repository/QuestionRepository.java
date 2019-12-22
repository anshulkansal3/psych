package com.launchpad.anshul.psych.repository;

import com.launchpad.anshul.psych.model.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
