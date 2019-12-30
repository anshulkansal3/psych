package com.launchpad.anshul.psych.repository;

import com.launchpad.anshul.psych.model.entity.EllenAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EllenAnswerRepository extends JpaRepository<EllenAnswer, Long> {
}
