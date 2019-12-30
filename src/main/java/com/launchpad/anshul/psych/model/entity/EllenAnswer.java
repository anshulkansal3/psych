package com.launchpad.anshul.psych.model.entity;

import com.launchpad.anshul.psych.Constants;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "ellen_answer")
public class EllenAnswer extends Auditable {
    @ManyToOne
    @Getter
    @Setter
    private Question question;

    @Getter
    @Setter
    @NotBlank
    @Column(length = Constants.MAX_ANSWER_LENGTH)
    private String answer;

    @Getter
    @Setter
    private Long votes = 0L;
}
