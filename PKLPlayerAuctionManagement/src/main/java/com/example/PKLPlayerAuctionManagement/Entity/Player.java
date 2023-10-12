package com.example.PKLPlayerAuctionManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerName;
    private String previousTeam;
    private String newTeam;
    private double soldForAmount;
    private String designation;
    
	public Player(Long id, String playerName, String previousTeam, String newTeam, double soldForAmount,
			String designation) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.previousTeam = previousTeam;
		this.newTeam = newTeam;
		this.soldForAmount = soldForAmount;
		this.designation = designation;
	}

	public Player() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPreviousTeam() {
		return previousTeam;
	}

	public void setPreviousTeam(String previousTeam) {
		this.previousTeam = previousTeam;
	}

	public String getNewTeam() {
		return newTeam;
	}

	public void setNewTeam(String newTeam) {
		this.newTeam = newTeam;
	}

	public double getSoldForAmount() {
		return soldForAmount;
	}

	public void setSoldForAmount(double soldForAmount) {
		this.soldForAmount = soldForAmount;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", previousTeam=" + previousTeam + ", newTeam="
				+ newTeam + ", soldForAmount=" + soldForAmount + ", designation=" + designation + "]";
	}
    
    
    
}