package com.launchpad.anshul.psych.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "GameMode")
public class GameMode {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
