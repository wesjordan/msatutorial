package com.wesjordan.msatutorial.controller;

import com.wesjordan.msatutorial.domain.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @RequestMapping(value = "/teams")
    public List<Team> getTeams(){
        List<Team> teams = new ArrayList<>();

        Team team = new Team();
        team.setId(0l);
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        teams.add(team);

        team = new Team();
        team.setId(1l);
        team.setLocation("Washington");
        team.setName("Generals");
        teams.add(team);

        return teams;
    }
}
