package com.launchpad.anshul.psych.repository;

import com.launchpad.anshul.psych.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
