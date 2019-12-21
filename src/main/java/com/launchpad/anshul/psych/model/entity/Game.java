package com.launchpad.anshul.psych.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Game")
public class Game {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "psych_face")
    private String psychFace;

    @Column(name = "pic")
    private String pic;

    @Column(name = "players")
    @ElementCollection
    private List<Player> playerList;

    @OneToOne
    @Column(name = "leader_id")
    @JoinColumn(name = "id")
    private Player leaderId;

    @Column(name = "is_over")
    private boolean isOver;

    @ManyToOne
    @Column(name = "game_id")
    @JoinColumn(name = "id")
    private GameMode gameMode;

    @

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsychFace() {
        return psychFace;
    }

    public void setPsychFace(String psychFace) {
        this.psychFace = psychFace;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Player getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Player leaderId) {
        this.leaderId = leaderId;
    }
}
