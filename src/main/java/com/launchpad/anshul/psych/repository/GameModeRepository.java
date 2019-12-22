package com.launchpad.anshul.psych.repository;

import com.launchpad.anshul.psych.model.entity.GameMode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameModeRepository extends JpaRepository<GameMode, Long> {
}
