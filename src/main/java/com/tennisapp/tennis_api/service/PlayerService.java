package com.tennisapp.tennis_api.service;

import com.tennisapp.tennis_api.dto.response.PlayerResponse;
import com.tennisapp.tennis_api.model.Player;
import com.tennisapp.tennis_api.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    private PlayerResponse playerResponse;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerResponse getUser(Long id){
        Player player = playerRepository.findById(id)
                .orElseThrow();

        return new PlayerResponse(
                player.getId(),
                player.getFirstName());
    }
}
