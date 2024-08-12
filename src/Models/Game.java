package Models;

import java.util.List;

public class Game {

	private Board board;
	
	private List<Player> players;
	
	private List<Move> moves;
	
	private GameState gameState;
	
	private Player winner;
	
	public Game(Board board, List<Player> players) {
			this.board = board;
			this.players = players;
	}
	
	// TODO 
	//private List<GameWinningStrategies> gameStrategies;

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Move> getMoves() {
		return moves;
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}
	
	
	public static  GameBuilder getBuilder() {
		return new GameBuilder();
	}
	

//	public List<GameWinningStrategies> getGameStrategies() {
//		return gameStrategies;
//	}
//
//	public void setGameStrategies(List<GameWinningStrategies> gameStrategies) {
//		this.gameStrategies = gameStrategies;
//	}
//	
	
	public static class GameBuilder{
		
		private List<Player> players;
		
		private int boardSize;
		
		
//		public GameBuilder(int noOfPalyers, int boardSize) {
//			super();
//			this.noOfPalyers = noOfPalyers;
//			this.boardSize = boardSize;
//		}

	

		public int getBoardSize() {
			return boardSize;
		}

		public GameBuilder setBoardSize(int boardSize) {
			this.boardSize = boardSize;
			
			return this;
		}
		
		
		public List<Player> getPlayers() {
			return players;
		}

		public GameBuilder setPlayers(List<Player> players) {
			this.players = players;
			return this;
		}

		
		public Game buildGame() {
			// Do validation here
			
			Board board = new Board(this.boardSize);
			Game game = new Game(board, this.players);
			
			return game;
			
			
		}
		
		
	}
	
	
}
