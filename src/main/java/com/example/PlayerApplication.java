package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PlayerApplication.class, args);
	}
	
	@Autowired PlayerRepository playerRespository;
	
	@PostConstruct
	public void init(){
		List<Player> list = new ArrayList<Player>();

		Player player = new Player();
		player.setId(0l);
		player.setPlayerName("Sachin Tendulkar");
		player.setPlayerType("Batting");
		list.add(player);
		
		player = new Player();
		player.setId(1l);
		player.setPlayerName("MS Dhoni");
		player.setPlayerType("Wicket Keeper");
		list.add(player);

		player = new Player();
		player.setId(2l);
		player.setPlayerName("Virat Kohli");
		player.setPlayerType("Batting");
		list.add(player);
		
		player = new Player();
		player.setId(3l);
		player.setPlayerName("Rohit Sharma");
		player.setPlayerType("Batting");
		list.add(player);

		player = new Player();
		player.setId(4l);
		player.setPlayerName("Ashwin Ravi");
		player.setPlayerType("Spin Bowler");
		list.add(player);

		player = new Player();
		player.setId(4l);
		player.setPlayerName("Zaheer Khan");
		player.setPlayerType("Fast Bowler");
		list.add(player);
		
		
		playerRespository.save(list);		
	}

		
}
