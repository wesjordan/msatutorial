package com.wesjordan.msatutorial.controller;

import com.wesjordan.msatutorial.domain.Team;
import com.wesjordan.msatutorial.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping(value = "/teams")
    public Iterable<Team> getTeams(){
        Iterable<Team> teams = teamRepository.findAll();
        return teams;
    }
}
