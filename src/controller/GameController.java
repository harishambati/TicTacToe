package controller;

import java.util.List;

import Models.Game;
import Models.Player;

public class GameController {
	
	
	public Game createGame(int dimension, List<Player> players) {
        return Game.getBuilder()
        		.setBoardSize(dimension)
                .setPlayers(players)
                .buildGame();
    }
	

}
