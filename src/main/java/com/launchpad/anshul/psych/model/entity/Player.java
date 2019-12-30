package com.launchpad.anshul.psych.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "players")
public class Player extends Auditable {


    @NotBlank
    @Getter
    @Setter
    private String name;


    @URL
    @Getter
    @Setter
    private String psychFaceUrl;

    @URL
    @Getter
    @Setter
    private String picUrl;


    @ManyToMany(mappedBy = "players")
    @Getter
    @Setter
    private List<Game> games;


}
