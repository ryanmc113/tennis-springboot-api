package com.tennisapp.tennis_api.service;

import com.tennisapp.tennis_api.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

//    public Player getuser(int id){
//        playerRepository
//    }
}
