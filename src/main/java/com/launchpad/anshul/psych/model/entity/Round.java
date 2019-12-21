package com.launchpad.anshul.psych.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Question")
public class Round {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToOne
    @Column(name = "question_id")
    @JoinColumn(name = "id")
    private Question question;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
