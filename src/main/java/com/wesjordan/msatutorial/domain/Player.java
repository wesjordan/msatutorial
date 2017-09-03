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
public class Player {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String position;

    public Player(String name, String position){
        this.name = name;
        this.position = position;
    }
}
