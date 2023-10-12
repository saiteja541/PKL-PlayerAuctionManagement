package com.example.PKLPlayerAuctionManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.PKLPlayerAuctionManagement.Entity.Player;
import com.example.PKLPlayerAuctionManagement.Service.PlayerService;
import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    
    @Controller
    public class HomeController {
        @GetMapping("/")
        public String home() {
            return "home"; 
        }
    }



    @GetMapping("/list")
    public String listPlayers(Model model) {
        List<Player> players = playerService.getAllPlayers();
        model.addAttribute("players", players);
        return "list";
    }

    @GetMapping("/add")
    public String addPlayerForm(Model model) {
        model.addAttribute("player", new Player());
        return "add";
    }

    @PostMapping("/add")
    public String addPlayer(@ModelAttribute("player") Player player) {
        playerService.savePlayer(player);
        return "redirect:/players/list"; 
    }

    @GetMapping("/update/{id}")
    public String getUpdatePlayerForm(@PathVariable Long id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "update";
    }

    @PostMapping("/update")
    public String updatePlayer(@ModelAttribute("player") Player updatedPlayer) {
        playerService.savePlayer(updatedPlayer);
        return "redirect:/players/list";
    }

    
    @GetMapping("/delete/{id}")
    public String deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return "redirect:/players/list";
    }

}
