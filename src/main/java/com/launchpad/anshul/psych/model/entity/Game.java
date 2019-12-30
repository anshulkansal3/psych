package com.launchpad.anshul.psych.model.entity;

import com.launchpad.anshul.psych.model.enums.GameMode;
import com.launchpad.anshul.psych.model.enums.GameStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "games")
public class Game extends Auditable {
    @NotNull
    @Getter
    @Setter
    private int numRounds = 0;

    @Getter
    @Setter
    private int currentRound;

    @ManyToMany
    @Getter
    @Setter
    private Map<Player,Stats> playerStats;

    @ManyToMany
    @Getter
    @Setter
    private List<Player> players;

    @Getter
    @Setter
    private GameMode gameMode;

    @Getter
    @Setter
    private GameStatus gameStatus = GameStatus.JOINING;

    @ManyToOne
    @NotNull
    @Getter
    @Setter
    private Player leaderId;

    @OneToMany(mappedBy = "game")
    @Getter @Setter
    private List<Round> rounds;



}
