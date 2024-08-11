package Models;

public class Bot extends Player {
	
	private BotDifficulty botdifficulty;
	
	private BotPlayingStrategy  botPlayingStrategy;

	public BotDifficulty getBotdifficulty() {
		return botdifficulty;
	}

	public void setBotdifficulty(BotDifficulty botdifficulty) {
		this.botdifficulty = botdifficulty;
	}

	public BotPlayingStrategy getBotPlayingStrategy() {
		return botPlayingStrategy;
	}

	public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
		this.botPlayingStrategy = botPlayingStrategy;
	}
	
	
	
	
}
