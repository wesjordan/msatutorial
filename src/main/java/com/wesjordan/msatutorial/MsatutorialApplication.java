package com.wesjordan.msatutorial;

import com.wesjordan.msatutorial.domain.Team;
import com.wesjordan.msatutorial.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MsatutorialApplication {

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(MsatutorialApplication.class, args);
	}

	@PostConstruct
	public void init(){
		List<Team> teams = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		teams.add(team);

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		teams.add(team);

		teamRepository.save(teams);
	}
}
