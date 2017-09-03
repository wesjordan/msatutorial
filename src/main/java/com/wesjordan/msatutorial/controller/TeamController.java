package com.wesjordan.msatutorial.controller;

import com.wesjordan.msatutorial.domain.Team;
import com.wesjordan.msatutorial.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping(value = "/teams")
    public Iterable<Team> getTeams(){
        Iterable<Team> teams = teamRepository.findAll();
        return teams;
    }

    @RequestMapping("/teams/{id}")
    public Team getTeam(@PathVariable Long id){
        return teamRepository.findOne(id);
    }
}
