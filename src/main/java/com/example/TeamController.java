package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

	@RequestMapping("/teams")
	public List<Team> getTeams() {

		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setId(0l);
		team.setTeamName("Mumbai Indians");
		team.setTeamLocation("Mumbai");
		list.add(team);

		team = new Team();
		team.setId(1l);
		team.setTeamName("Chennai Super Kings");
		team.setTeamLocation("Chennai");
		list.add(team);

		team = new Team();
		team.setId(2l);
		team.setTeamName("Kolkata Knight Riders");
		team.setTeamLocation("Kolkata");
		list.add(team);

		
		team = new Team();
		team.setId(3l);
		team.setTeamName("Punjab Warriors");
		team.setTeamLocation("Punjab");
		list.add(team);

		
		team = new Team();
		team.setId(4l);
		team.setTeamName("Sunrisers");
		team.setTeamLocation("Hyderabad");
		list.add(team);
		
		
		return list;

	}
}
