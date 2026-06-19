package com.tennisapp.tennis_api.controller;


import com.tennisapp.tennis_api.model.Player;
import com.tennisapp.tennis_api.repository.PlayerRepository;
import com.tennisapp.tennis_api.service.PlayerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/player")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerController {
    private final PlayerRepository playerRepository;
    private final PlayerService playerService;

    public PlayerController(PlayerRepository playerRepository, PlayerService playerService) {
        this.playerRepository = playerRepository;
        this.playerService = playerService;
    }

//    @GetMapping("/{id}")
//    public Player getPlayer(int id){
//        playerService.
//    }
}
