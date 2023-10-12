package com.example.PKLPlayerAuctionManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.PKLPlayerAuctionManagement.Entity.Player;
import com.example.PKLPlayerAuctionManagement.Repository.PlayerRepository;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    public void deletePlayer(Long playerId) {
        playerRepository.deleteById(playerId);
    }
    
    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    
}
