package com.example.PKLPlayerAuctionManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PKLPlayerAuctionManagement.Entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
