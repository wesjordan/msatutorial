package com.wesjordan.msatutorial.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    private String Name;
    private String location;
    private String mascot;

}
