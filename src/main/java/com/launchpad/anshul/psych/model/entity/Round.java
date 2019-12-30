package com.launchpad.anshul.psych.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Entity
@Table(name = "Question")
public class Round extends Auditable {
    @ManyToOne
    @Getter
    @Setter
    @NotNull
    private Game game;

    @Getter
    @Setter
    @NotNull
    private int roundNumber;

    @ManyToMany
    @Getter
    @Setter
    private Map<Player,PlayerAnswer> playerAnswers;
}
