package com.wesjordan.msatutorial.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Team {

    private Long id;
    private String Name;
    private String location;
    private String mascot;

}
