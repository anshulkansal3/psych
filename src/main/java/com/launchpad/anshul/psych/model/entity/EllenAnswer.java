package com.launchpad.anshul.psych.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "allen_answer")
public class EllenAnswer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


}
