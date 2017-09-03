package com.wesjordan.msatutorial.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String mascot;

    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name="teamId")
    private Set<Player> players;


    public Team(String location, String name, Set<Player> players){
        this.location = location;
        this.name = name;
        this.players = players;
    }
}
